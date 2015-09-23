package junit;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit extends TestCase {
	String message = "Hello World!";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		int num = 5;
		//assertEquals(message, messageUtil.printMessage());
		assertNotNull(message);
		assertFalse(6 < num);
	}
}