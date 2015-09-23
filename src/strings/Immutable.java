/**
 * 
 */
package strings;

/**
 * @author Administrator
 *
 */
public class Immutable {
	
	public static String upcase (String s) {
		return s.toUpperCase();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "I am a boy!";
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}

}
