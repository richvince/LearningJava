package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	static public final String POEM = 
		"Twas brilling, and the slithy toves\n" +
		"Did gyre and gimble in the wabe.\n" +
		"All mimsy were the borogoves.\n";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = 
			Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
				.matcher(POEM); //扑捉每行最后3个词
		while (m.find()) {
			for (int j = 0; j <= m.groupCount(); j++)
				System.out.print("[" + m.group(j) + "]");
			System.out.println();
		}
	}

}
