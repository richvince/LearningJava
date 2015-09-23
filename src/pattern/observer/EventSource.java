package pattern.observer;

import java.util.Observable;

public class EventSource extends Observable implements Runnable {
	
	public void run() {
		String command = "Change has been made!";
		
		setChanged();
		notifyObservers(command);
	}
}
