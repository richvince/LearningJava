/*
Copyright 2010 kiddy
*/
package other;

public class MoreActionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(MoreAction action : MoreAction.values())
			System.out.printf("%s: %s%n",
					action, action.getDescription());
	}

}
