package holding;

import java.util.*;

public class SimpleCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			c.add(i);
		for (Integer i : c)
			System.out.print(i + ",");
	}

}
