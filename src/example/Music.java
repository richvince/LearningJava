package example;

public class Music {

	/**
	 * @param args
	 */
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		tune(flute);
	}

}
