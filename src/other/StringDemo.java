/*
Copyright 2010 kiddy
*/
package other;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("light");
		String str2 = new String("light");
		String str3 = "light";
		String str4 = "light";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			str1 = str1 + i;
		long endTime = System.currentTimeMillis();
		System.out.println("the cost of time is " + (endTime - beginTime));
		StringBuilder sb = new StringBuilder(str1);
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
			sb.append(i);
		endTime = System.currentTimeMillis();
		System.out.println("the cost of time is " + (endTime - beginTime));
		
	}

}
