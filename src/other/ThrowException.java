/*
Copyright 2010 kiddy
*/
package other;

class Cc {
	public static int count (int i) {
		try{
			throw new ArithmeticException();
		} 
		finally {
			return 1;
		}
	}
}
public class ThrowException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cc.count(1);
	}

}
