/*
Copyright 2010 kiddy
*/
package generic;

public class GenericFoo3<T1, T2> {
	private T1 foo1;
	private T2 foo2;
	
	public void setFoo1(T1 foo) {
		this.foo1 = foo;
	}
	
	public T1 getFoo1() {
		return foo1;
	}
	
	public void setFoo2(T2 foo) {
		this.foo2 = foo;
	}
	
	public T2 getFoo2() {
		return foo2;
	}
}
