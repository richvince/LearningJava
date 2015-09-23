/*
Copyright 2010 kiddy
*/
package generic;

public class SubGenericFoo3<T1, T2, T3> extends GenericFoo3<T1, T2> {
	private T3 foo3;
	
	public void setFoo3(T3 foo) {
		this.foo3 = foo;
	}
	
	public T3 getFoo3() {
		return foo3;
	}
}
