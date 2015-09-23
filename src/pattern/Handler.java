/*
Copyright 2010 kiddy
*/
package pattern;

public abstract class Handler {
	protected Handler successor;
	
	public final void handleRequest(Request request) {
		boolean handledByThisNode = this.handleRequestImpl(request);
		if(successor != null && !handledByThisNode)
			successor.handleRequest(request);
	}
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract boolean handleRequestImpl(Request request);
}
