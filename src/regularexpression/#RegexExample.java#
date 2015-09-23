package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	
	public static void main(String[] args) {
		
		/*
		Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("ABcabdAb");
		
		while(matcher.find()) {
			System.out.println("Found teh text \"" + matcher.group() + 
					"\" starting at " + matcher.start() + " index and ending at index " + 
					matcher.end());
		}
		
		//using Pattern split() method
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split("one@two#three:four$five");
		for(String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}
		//using Matcher.replaceFirst() and replaceAll() methods
		pattern = Pattern.compile("1*2");
		matcher = pattern.matcher("11234512678");
		System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
		System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));
		*/
		Pattern p = Pattern.compile("(\\w+)\\s*=\\s*((\\w*\\.)*[A-Z]\\w*)");
		Matcher m = p.matcher(" cartesian  = some.class.Name  ");
		if(m.find()) {
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		} else {
			System.out.println("No match! Please check!");
		}
	}
}
