/*
Copyright 2010 kiddy
*/
package junit;

import org.junit.Assert;
import org.junit.Test;

public class MessageTestJunit {
	String name = "Robert";
	
	MessageUtil message = new MessageUtil(name);
	String salutation = "Hi!"+name;
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message.printMessage();
	}
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		Assert.assertEquals(salutation, message.salutationMessage());
	}
}
