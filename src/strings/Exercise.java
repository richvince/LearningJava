package strings;

public class Exercise {
	final int i;
	public Exercise() {
		i = 2;
	}
	public Exercise(int a) {
		i = a;
	}
	protected void method() {}
	public static int method(int a) {return 0;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = "kvill";
		String s1 = new String("kvill");
		String s2 = "kv" + new String("ill");
		System.out.println(s0 == s1);
		System.out.println(s0 == s2);
	}

}

class Sub extends Exercise {
	public static int method(int a) {return 0;}
	protected void method(String s) {}
}