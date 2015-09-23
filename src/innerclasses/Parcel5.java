/*
Copyright 2010 kiddy
*/
package innerclasses;

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			
			public PDestination(String s) { this.label = s; }
			public String readLabel() {
				return label; 
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination destination = p.destination("light");
		System.out.println(destination.readLabel());
	}
}
