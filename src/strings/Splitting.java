package strings;

import java.util.Arrays;

public class Splitting {
	public static String knights = 
		"Then, when you have found the shrubbery, you must " +
		"cut down the tree in forest";
	public static void split(String regex) {
		System.out.println(
				Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");
		split("n\\W+");
	}

}
