package at.usga.sam4000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;

import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;
import javax.comm.UnsupportedCommOperationException;


/**
 A class that handles the details of a serial connection. Reads from one 
 Holds the state of the connection.
 */
public abstract class AbstractSerialConnection implements SerialPortEventListener {

	private SerialParameters parameters;
	private OutputStream os;
	private InputStream is;
	private CommPortIdentifier portId;
	private SerialPort serialPort;
	private boolean open;

	/**
	 Creates a SerialConnection object and initilizes variables passed in
	 as params.
	 @param parent A SerialDemo object.
	 @param parameters A SerialParameters object.
	 @param messageAreaOut The TextArea that messages that are to be sent out
	 of the serial port are entered into.
	 @param messageAreaIn The TextArea that messages comming into the serial
	 port are displayed on.
	 */
	public AbstractSerialConnection(SerialParameters parameters) {
		this.parameters = parameters;
		open = false;
	}

	/**
	 * Stream that writes to the console.
	 * @return stream to console
	 */
	public OutputStream getOutputStream() {
		return os;
	}

	/**
	 Attempts to open a serial connection and streams using the parameters
	 in the SerialParameters object. If it is unsuccesfull at any step it
	 returns the port to a closed state, throws a 
	 <code>SerialConnectionException</code>, and returns.

	 Gives a timeout of 30 seconds on the portOpen to allow other applications
	 to reliquish the port if have it open and no longer need it.
	 */
	public void openConnection() throws IOException {
		// Obtain a CommPortIdentifier object for the port you want to open.
		try {
			portId = CommPortIdentifier.getPortIdentifier(parameters.getPortName());
		} catch (NoSuchPortException e) {
			throw new IOException("No port with ID " + parameters.getPortName());  //$NON-NLS-1$);
		}

		// Open the port represented by the CommPortIdentifier object. Give
		// the open call a relatively long timeout of 30 seconds to allow
		// a different application to reliquish the port if the user 
		// wants to.
		try {
			serialPort = (SerialPort) portId.open("serialconsole", 5000); //$NON-NLS-1$
		} catch (PortInUseException e) {
			throw new IOException("Port already in use (" + parameters.getPortName() + ")");  //$NON-NLS-1$
		} 

		// Set the parameters of the connection. If they won't set, close the
		// port before throwing an exception.
		setConnectionParameters();

		// Open the input and output streams for the connection. If they won't
		// open, close the port before throwing an exception.
		try {
			os = serialPort.getOutputStream();
			is = serialPort.getInputStream();
		} catch (IOException e) {
			serialPort.close();
			throw e;
		} 

		// Add this object as an event listener for the serial port.
		try {
			serialPort.addEventListener(this);
		} catch (TooManyListenersException e) {
			serialPort.close();
			throw new IOException(e.getMessage());
		} 

		// Set notifyOnDataAvailable to true to allow event driven input.
		serialPort.notifyOnDataAvailable(true);

		// Set notifyOnBreakInterrup to allow event driven break handling.
		serialPort.notifyOnBreakInterrupt(true);

		// Set receive timeout to allow breaking out of polling loop during
		// input handling.
		try {
			serialPort.enableReceiveTimeout(30);
		} catch (UnsupportedCommOperationException e) {
			// nothing to do
		}

		open = true;
	}

	/**
	 Sets the connection parameters to the setting in the parameters object.
	 If set fails return the parameters object to origional settings and
	 throw exception.
	 */
	public void setConnectionParameters() {

		// Save state of parameters before trying a set.
		int oldBaudRate = serialPort.getBaudRate();
		int oldDatabits = serialPort.getDataBits();
		int oldStopbits = serialPort.getStopBits();
		int oldParity = serialPort.getParity();
		
		// Set connection parameters, if set fails return parameters object
		// to original state.
		try {
			serialPort.setSerialPortParams(parameters.getBaudRate(), parameters
					.getDatabits(), parameters.getStopbits(), parameters
					.getParity());
		} catch (UnsupportedCommOperationException e) {
			parameters.setBaudRate(oldBaudRate);
			parameters.setDatabits(oldDatabits);
			parameters.setStopbits(oldStopbits);
			parameters.setParity(oldParity);
		}

		// Set flow control.
		try {
			serialPort.setFlowControlMode(parameters.getFlowControlIn() | parameters.getFlowControlOut());
		} catch (UnsupportedCommOperationException e) {
			 // nothing to do
		}
	}

	/**
	 Close the port and clean up associated elements.
	 */
	public void closeConnection() {
		// If port is alread closed just return.
		if (!open) {
			return;
		}

		// Check to make sure sPort has reference to avoid a NPE.
		if (serialPort != null) {
			try {
				// close the i/o streams.
				os.close();
				is.close();
			} catch (IOException e) {
				System.err.println(e);
			}

			// Close the port.
			serialPort.close();
		}

		open = false;
	}

	/**
	 Send a one second break signal.
	 */
	public void sendBreak() {
		serialPort.sendBreak(1000);
	}

	/**
	 Reports the open status of the port.
	 @return true if port is open, false if port is closed.
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 Handles SerialPortEvents. The two types of SerialPortEvents that this
	 program is registered to listen for are DATA_AVAILABLE and BI. During 
	 DATA_AVAILABLE the port buffer is read until it is drained, when no more
	 data is availble and 30ms has passed the method returns. When a BI
	 event occurs the words BREAK RECEIVED are written to the messageAreaIn.
	 */
	public void serialEvent(SerialPortEvent e) {
		int newData = 0;
		int length = 0;
		byte[] data = new byte[1024];
		
		// Determine type of event.
		switch (e.getEventType()) {
		
		// Read data until -1 is returned. If \r is received substitute
		// \n for correct newline handling.
		case SerialPortEvent.DATA_AVAILABLE: {
			while (newData != -1) {
				try {
					newData = is.read();
					if (newData == -1) {
						break;
					}
					
					data[length++] = (byte)newData;
				} catch (IOException ex) {
					System.err.println(ex);
					return;
				}
			}
			
			appendReceivedData(data, length);
			break;
		}
		
		case SerialPortEvent.BI:
			break;
			
		case SerialPortEvent.PE:
			break;
		}

	}

	protected abstract void appendReceivedData(byte[] data, int length);

}
