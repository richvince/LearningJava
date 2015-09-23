/*
Copyright 2010 kiddy
*/
package other;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "booot";
		Pattern p = Pattern.compile("o");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println(Arrays.toString(s.split("o")));
	}

}
