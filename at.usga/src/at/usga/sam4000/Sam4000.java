package at.usga.sam4000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.sun.xml.internal.ws.api.Cancelable;

public class Sam4000 implements ITeilerListener {
	private static Sam4000 instance;
	private Sam4000Connection connection;
	private List<ITeilerListener> listeners = new ArrayList<ITeilerListener>();

	private Sam4000() throws IOException {
		super();

		String property = System.getProperty("com");
		String com;
		if(property != null) {
			com = property;
		} else {
			com = "COM1";
		}
		
		SerialParameters params = new SerialParameters(com, 9600, 0, 0, 8,
				1, 0);
		connection = new Sam4000Connection(params);
		connection.openConnection();
		
		connection.addListener(this);
		initializeMachine();
		initPolling();
	}

	public static Sam4000 getInstance() throws IOException {
		if (instance == null) {
			instance = new Sam4000();
		}
		return instance;
	}

	public void initPolling() throws IOException {
		new Job("huhu") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					connection.initPolling();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
			
		}.schedule();
	}

	private void initializeMachine() throws IOException {
		System.out.println("Init address with 0xB2");
		connection.write((byte) -78); // Address
		connection.sleep(1000);
	}

	public void teilerReceived(double teiler) {
		for(ITeilerListener listener : listeners ) {
			listener.teilerReceived(teiler);
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

	public void stopEvaluation() {
		connection.stopPolling();
	}
	
	public void startEvaluation() {
		connection.startPolling();
	}

}
