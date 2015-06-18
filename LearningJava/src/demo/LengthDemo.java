package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LengthDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 3);
		System.out.println(map.containsKey(1));
		System.out.println(map.get(1) + 3);
		Iterator iter = map.entrySet().iterator();
		Set<Integer> set = map.keySet();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println ("**************\n"+str+"\n*************");
		
	}
}

