package pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
	
	public void update(Observable obj, Object arg) {
		if(arg instanceof String) {
			String resp = String.valueOf(arg);
			System.out.println("Reveived Response: " + resp);
		}
	}

}

