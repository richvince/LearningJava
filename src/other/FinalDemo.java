/*
Copyright 2010 kiddy
*/
package other;

class DemoClass {
	public DemoClass() {}
	private int action() { return 1; }
}
public class FinalDemo extends DemoClass {

	/**
	 * @param args
	 */
	public int action() { return 2; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo dc = new FinalDemo();
		System.out.println(dc.action());
	}

}
