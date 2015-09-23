package pattern.mediator;

public class Main {
	
	static public void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague applicationColleague = new ApplicationColleage(mediator);
		Colleague mobileColleague = new MobileColleague(mediator);
		
		mediator.addColleague(mobileColleague);
		mediator.addColleague(applicationColleague);
		
		mobileColleague.send("Hello World!");
		applicationColleague.send("Good Afternoon!");
	}
}
