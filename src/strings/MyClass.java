/*
Copyright 2010 kiddy
*/
package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "booo:and:foo";
		Pattern p = Pattern.compile("bo+.+?");
		Matcher m = p.matcher(s1);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
