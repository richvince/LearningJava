/*
Copyright 2010 kiddy
*/
package other;


public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int[] row : arr) {
			for (int element : row) {
				System.out.print(element + "\t");
				}
			System.out.println();
		}
		
		double d = 0.2;
		System.out.println(d > 0);
		System.out.println(Math.ceil(0.3));
	}

}
