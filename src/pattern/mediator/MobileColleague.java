package pattern.mediator;

public class MobileColleague extends Colleague {
	
	public MobileColleague(IMediator m) {
		super(m);
	}

	@Override
	public void recieve(String message) {
		System.out.println("Mobile Received: " + message);
	}

}
