package pattern.mediator;

public abstract class Colleague {
	private IMediator mediator;
	
	public Colleague(IMediator m) {
		this.mediator = m;
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public abstract void recieve(String message);
}
