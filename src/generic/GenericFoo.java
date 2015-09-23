/*
Copyright 2010 kiddy
*/
package generic;

public class GenericFoo<T> {
	private T foo;
	
	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public T getFoo() {
		return this.foo;
	}
}
