/*
Copyright 2010 kiddy
*/
package pattern;

public class ConcreteHandlerOne extends Handler {
	
	public boolean handleRequestImpl(Request request) {
		if(request.getValue() < 0) {
			System.out.println("Request " + request.getName() + " has been handled by HandlerOne!");
			return true;
		} else {
			return false;
		}
	}
}
