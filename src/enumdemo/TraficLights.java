/*
Copyright 2010 kiddy
*/
package enumdemo;

@SuppressWarnings("unused")
public enum TraficLights {
	RED("ºìÉ«", 1), GREEN("ÂÌÉ«", 2), YELLOW("»ÆÉ«", 3);
	//field
	private String name;
	private int index;
	//constructor
	private TraficLights(String name, int index) {
		this.name = name;
		this.index = index;
	}
	//add new public method to enum
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		TraficLights light = TraficLights.GREEN;
		
		switch(light) {
		case RED:
			System.out.println("The value of light is "+ TraficLights.RED);
			break;
		case GREEN:
			System.out.println("The value of light is "+ TraficLights.GREEN.name());
			break;
		case YELLOW:
			System.out.println("The value of light is "+ TraficLights.YELLOW);
			break;
		}
	}
}
