package strings;

import java.util.ArrayList;

public class ArrayListDisplay {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		String tmp = "a";
		for (int i = 0; i < 3; i++)
			al.add(tmp);
		System.out.println(al);
	}

}
