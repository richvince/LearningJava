package holding;

import java.util.*;

public class ApplesAndOrangesWithGenerics {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		for (Apple c : apples)
			System.out.println(c.id());
	}

}
