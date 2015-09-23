package example;

public class Flower {

	/**
	 * @param args
	 */
	boolean checkedOut = false;
	Flower(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if (checkedOut)
			System.out.println("Error: checked out!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower rose = new Flower(true);
		new Flower(true);
		System.gc();
	}

}
