/*
Copyright 2010 kiddy
*/
package innerclasses;

public class Parcel {

	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	class Destination {
		private String label;
		Destination(String whereTo) { label = whereTo; }
		String readLabel() { return label; }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel p = new Parcel();
		Parcel.Contents c = p.new Contents();
		Parcel.Destination d = p.new Destination("Park");
	}

}
