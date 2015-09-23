/*
Copyright 2010 kiddy
*/
package reflection;

class Test {
	//other code
}
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> test1 = null;
		Class<?> test2 = null;
		Class<?> test3 = null;
		//一般尽量采用这种方式
		try {
			test1 = Class.forName("reflection.Test");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		test2 = new Test().getClass();
		test3 = Test.class;
		System.out.println(test1.getName());
		System.out.println(test2.getName());
		System.out.println(test3.getName());
	}

}
