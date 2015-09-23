/*
Copyright 2010 kiddy
*/
package dynamicproxy;

public class BookFacadeStaticProxy implements BookFacade {
	private BookFacade bookFacade;
	
	public void addBook() {
		bookFacade = new BookFacadeImpl();
		
		System.out.println("StaticProxy begins ...");
		bookFacade.addBook();
		System.out.println("StaticProxy ends ...");
	}

}
