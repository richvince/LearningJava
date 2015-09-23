package example;

import java.util.*;

public class ArrayClassObj {

	/**
	 * @param args
	 */
	static Random rand = new Random();
	static int pRand(int mod){
		return Math.abs(rand.nextInt()) % mod + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[pRand(20)];
		System.out.println("the length of a is " + a.length);
		for (int i = 0; i < a.length; i++){
			a[i] = new Integer(pRand(500));
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
