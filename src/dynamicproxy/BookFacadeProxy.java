/*
Copyright 2010 kiddy
*/
package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {
	private Object bookFacade;
	
	public Object bind(Object target) {
		this.bookFacade = target;
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("transcation begin ...");
		Object result = method.invoke(bookFacade, args);
		System.out.println("transcation finish ...");
		return result;
	}
}
