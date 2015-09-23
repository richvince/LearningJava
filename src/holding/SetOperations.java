/*
Copyright 2010 kiddy
*/
package holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, 
				"A B C D E F G H I J K L".split(" "));
		set1.add("M");
		System.out.println("H: " + set1.contains("H"));
		System.out.println("N: " + set1.contains("N"));
		System.out.println("set1: " + set1);
		set1.remove("H");
		Collections.addAll(set1, "X Y Z".split(" "));
		System.out.println("set1: " + set1);
	}

}
