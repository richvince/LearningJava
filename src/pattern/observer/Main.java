package pattern.observer;

public class Main {
	
	static public void main(String[] args) {
		EventSource event = new EventSource();
		ResponseHandler response = new ResponseHandler();
		
		event.addObserver(response);
		
		Thread t1 = new Thread(event);
		t1.start();
	}
}
