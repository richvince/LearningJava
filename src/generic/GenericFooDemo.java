/*
Copyright 2010 kiddy
*/
package generic;


public class GenericFooDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericFoo1<Integer, Boolean> foo = new GenericFoo1<Integer, Boolean>();
		foo.setFoo1(new Integer(5));
		foo.setFoo2(new Boolean(true));
		System.out.println(foo.getFoo1());
		System.out.println(foo.getFoo2());
		
		GenericFoo2<Integer> foo1 = new GenericFoo2<Integer>();
		Integer[] integers = { new Integer(5), new Integer(7), new Integer(9) };
		foo1.setFoo(integers);
		for (Integer integer : foo1.getFoo())
			System.out.println(integer);
		
		GenericFoo<String> foo2 = new GenericFoo<String>();
		foo2.setFoo("light");
		GenericFoo<?> immutableFoo = foo2;
		System.out.println(immutableFoo.getFoo());
//		immutableFoo.setFoo("weight");
//		immutableFoo.setFoo(null);
//		System.out.println(immutableFoo.getFoo());
		
		SubGenericFoo3<Integer, String, Boolean> foo3 = new SubGenericFoo3<Integer, String, Boolean>();
		foo3.setFoo1(new Integer(3));
		System.out.println(foo3.getFoo1());
	}

}
