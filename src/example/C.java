/*
Copyright 2010 kiddy
*/
package example;

class Atest {
	public Atest() {
	initAttrs();
	}

	public void initAttrs() {
	System.out.println("initAttrs in A");
	}
	}

	class B extends Atest {
	public String s = null;

	public B() {
	s = "Hello World!";
	}

	public void initAttrs() {
	s = "aaa";
	// System.out.println(this.s);
	System.out.println("initAttrs in ddd");
	}
	}


public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.s);
	}

}
