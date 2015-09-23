package pattern.mediator;

public class ApplicationColleage extends Colleague {
	
	public ApplicationColleage(IMediator m) {
		super(m);
	}

	@Override
	public void recieve(String message) {
		System.out.println("Colleague Received: " + message);
	}

}
