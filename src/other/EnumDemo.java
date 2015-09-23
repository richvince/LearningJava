/*
Copyright 2010 kiddy
*/
package other;

public class EnumDemo {
	
	public static void doAction(Action action) {
		switch (action) {
		case TURN_LEFT:
			System.out.println("向左转");
			break;
		case TURN_RIGHT:
			System.out.println("向右转");
			break;
		case SHOOT:
			System.out.println("射击");
			break;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doAction(Action.SHOOT);
		doAction(Action.TURN_RIGHT);
		for(Action ac : Action.values())
			System.out.println(ac.toString());
	}

}
