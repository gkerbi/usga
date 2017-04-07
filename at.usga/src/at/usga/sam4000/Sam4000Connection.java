package at.usga.sam4000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sam4000Connection extends AbstractSerialConnection {

	private static byte STX = 0x02;
	private static byte ETB = 0x17;
	private static byte ENQ = 0x05;
	private static byte ACK = 0x06;
	private static byte CR = 0x0D;
	private static byte NAK = 0x15;

	private ArrayList<ITeilerListener> listeners = new ArrayList<ITeilerListener>();

	private boolean gotStx = false;
	private boolean cancel;

	public Sam4000Connection(SerialParameters parameters) {
		super(parameters);
	}

	@Override
	protected void appendReceivedData(byte[] data, int length) {
		int pos = 0;
		while (pos < length) {
			byte b = data[pos++];
			if (b == STX) {
				System.err.println("GOT STX");
				gotStx = true;
				String string = new String(data);
				int end = string.indexOf("$");
				String substring = string.substring(1, end - 2);
				byte checksum1 = data[end-1];
				byte checksum2 = calcChecksum(string.substring(0, end - 1));
				StringTokenizer tokens = new StringTokenizer(substring, "\n\r");
				System.out.println("skip: " + tokens.nextToken()); // read Code (????????)
				System.out.println("skip: " + tokens.nextToken()); // read Code (????????)
				System.out.println("skip: " + tokens.nextToken()); // read Type (LG)
				System.out.println("skip: " + tokens.nextToken()); // number of targets
				System.out.println("skip: " + tokens.nextToken()); // number of shots
				System.out.println("skip: " + tokens.nextToken()); // Teiler Faktor
				int i = 0;
				while (tokens.hasMoreTokens()) {
					double value = Double.parseDouble(tokens.nextToken());
					double teiler = Double.parseDouble(tokens.nextToken());
					int x = Integer.parseInt(tokens.nextToken());
					int y = Integer.parseInt(tokens.nextToken());
					System.out.println("Teiler: " + Double.toString(teiler));
					for(ITeilerListener listener : listeners) {
						listener.teilerReceived(teiler);
					}
				}
				try {
					if(checksum1 == checksum2) {
						System.out.println("ACK");
						write(ACK);
					} else {
						System.err.println("NAK");
						write(NAK);
					}
					sleep(1000);
					gotStx = false;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void addListener(ITeilerListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(ITeilerListener listener) {
		listeners.remove(listener);
	}

	private byte calcChecksum(String string) {
		byte[] bytes = string.getBytes();
		byte checksum = 0;
		for (byte bite : bytes) {
			checksum ^= bite;
		}
		if (checksum < 32) {
			checksum += 32;
		}
		return checksum;
	}

	public void startPolling() {
		cancel = false;
	}
	
	public void initPolling() throws IOException {
		while(true) {
			while(!cancel) {
				if(!gotStx) {
					write(ENQ); 
					// System.out.print(".");
				}
				sleep(100);
			}
			sleep(100);
		}
	}

	void write(byte b) throws IOException {
		byte[] data = new byte[] { b };
		getOutputStream().write(data);
	}

	static void sleep(int millis) throws IOException {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new IOException(e);
		}
	}

	public void stopPolling() {
		cancel = true;
	}
}
