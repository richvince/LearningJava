package innerclasses;

class Parent {
	private int i = 9;
	protected int j;
	private static int x1 = printInit("static Parent.x1 initialized");

	Parent() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	protected static int printInit(String s) {
		print(s);
		return 47;
	}

	/**
	 * @param string
	 */
	protected static void print(String string) {
		System.out.println(string);
	}
}

public class Child extends Parent {

	private int k = printInit("Child.k initialized");
	private static int x2 = printInit("static Child.x2 initialized");

	public Child() {
		print("k = " + k);
		print("j = " + j);
	}

	public static void main(String[] args) {
		print("Child constructor");
		Child b = new Child();
	}
}
