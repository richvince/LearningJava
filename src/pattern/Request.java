/*
Copyright 2010 kiddy
*/
package pattern;

public class Request {
	private int value;
	private String name;
	
	public Request(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandlerOne();
		Handler h2 = new ConcreteHandlerTwo();
		h1.setSuccessor(h2);
		
		h1.handleRequest(new Request(-1, "Negative Vaule"));
		h1.handleRequest(new Request(10, "Positive Value"));
	}
}
