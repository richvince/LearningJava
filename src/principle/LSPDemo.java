/*
Copyright 2010 kiddy
*/
package principle;

import java.util.Arrays;
import java.util.List;

public class LSPDemo {

	public static void main(String[] args) {
		String[] strs = {"name1", "name2"};
		List<String> strList = Arrays.asList(strs);
		strList.add("name3");
		for(String s : strList) {
			System.out.print(s+"\t");
		}
	}
}
