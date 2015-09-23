/*
Copyright 2010 kiddy
*/
package moderate;

public class Solution {
	
	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap, a = " + a + ", b = " + b);
	}
	
	public static void swap2(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swap, a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		int a = 3, b = 2;
		swap(a, b);
		swap2(a, b);
	}
}
