/*
Copyright 2010 kiddy
*/
package junit;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase {
	protected double dValue1;
	protected double dValue2;
	
	@Before
	public void setUp() {
		dValue1 = 2.0;
		dValue2 = 3.0;
	}
	
	@Test
	public void testAdd() {
		//count the number of test cases
		System.out.println(this.countTestCases());
		
		//test getName
		System.out.println(this.getName());
		
		this.setName("New Test");
		String testName = this.getName();
		System.out.println(testName);
	}
}
