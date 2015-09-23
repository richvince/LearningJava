/*
Copyright 2010 kiddy
*/
package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {
	
	public static void main(String[] args) {
		String[] seasons = new String[]{"spring", "summer", "fall", "winter"};
		System.out.println("The size of seasons is " + seasons.length);
		
		List<String> list = Arrays.asList(seasons);
		Collections.sort(list);
		for(String s: seasons) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(5));
		numbers.add(new Integer(4));
		numbers.add(new Integer(3));
		numbers.add(new Integer(2));
		numbers.add(new Integer(1));
		Collections.sort(numbers);
		for(Integer i: numbers) {
			System.out.println(i);
		}
	}
}
