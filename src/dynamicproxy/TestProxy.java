/*
Copyright 2010 kiddy
*/
package dynamicproxy;

public class TestProxy {
	public static void main(String[] args) {
		/**
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookFacade = (BookFacade)proxy.bind(new BookFacadeImpl());
		bookFacade.addBook();
		*/
		BookFacade bookFacade = new BookFacadeStaticProxy();
		bookFacade.addBook();
	}
}
