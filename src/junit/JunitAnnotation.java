/*
Copyright 2010 kiddy
*/
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotation {
	//execute before the test
	@Before
	public void before() {
		System.out.println("in before");
	}
	//execute after the test
	@After
	public void after() {
		System.out.println("in after");
	}
	//execute before the class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in beforeClass");
	}
	//execute after the class
	@AfterClass
	public static void afterClass() {
		System.out.println("in afterClass");
	}
	//test case
	@Test
	public void test() {
		System.out.println("in test");
	}	
}
