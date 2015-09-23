package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements IMediator {
	List<Colleague> colleagues;
	
	public ConcreteMediator() {
		colleagues = new ArrayList<Colleague>();
	}
	
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
	}
	
	public void send(String message, Colleague originator) {
		for(Colleague colleague: colleagues) {
			//don't tell ourselves
			if(colleague != originator) {
				colleague.recieve(message);
			}
		}
	}
}
