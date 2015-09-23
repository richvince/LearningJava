/*
Copyright 2010 kiddy
*/
package other;

public class Demo {

	public void change(Cat cat) {
		cat.setAge(5);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(8, 12);
		Demo demo = new Demo();
		demo.change(cat);
		System.out.println(cat.getAge());
	}

}
