package example;

import java.util.*;

public class Example {

	/**
	 * @param args
	 */
	int iy = printInt("This is the second!");
	static int ix = printInt("This is the first!");
	public Example(){
		System.out.println("This is the third!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the forth!");
		new Example();
	}
	static int printInt(String s){
		System.out.println(s);
		return 1;
	}
}
