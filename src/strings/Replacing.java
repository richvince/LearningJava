package strings;

public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}

}
