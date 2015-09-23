/*
Copyright 2010 kiddy
*/
package generic;

import java.util.List;

public class ListGenericFoo<T extends List> {
	private T[] fooArray;
	
	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}
	
	public T[] getFooArray() {
		return fooArray;
	}
}
