import java.util.Hashtable;


public class MySet extends Hashtable<String, String>{

	private static final long serialVersionUID = -6689111193467895131L;

	public MySet() {
		super();
	}
	
	@Override
	public String put(String s1, String s2) {
//		super.put(s1, value)
		System.out.println("Calling MySet.put rather than Hashtable!");
		return null;
	}
}
