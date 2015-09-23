/*
Copyright 2010 kiddy
*/
package thead;

public class FinalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s1 = "a boy";
		String s2 = "a girl";
		final int a = 2;
		System.out.println(ITest.id);
	}

}

final class TestClass {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}	//final类无法被继承

interface ITest {
	int id = 1;
	String name = "light";
}

