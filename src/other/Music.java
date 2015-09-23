/*
Copyright 2010 kiddy
*/
package other;

abstract class Instrument {
	private int i; //Storage allocated for each
	public abstract void play(int i);
	public String what() { 
		System.out.println("Instrument!");
		return "Instrument"; 
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(int i) {
		System.out.println("Wind.play() " + i);
	}
	public String what() { super.what(); return "Wind"; }
	public void adjust() {}
}
public class Music {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind wind = new Wind();
		System.out.println(wind.what());
	}

}
