/*
Copyright 2010 kiddy
*/
package junit;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static void main(String[] args) {
		TestSuite suite = new TestSuite(TestJunit.class, TestJunit2.class);
		TestResult results = new TestResult();
		suite.run(results);
		System.out.println("Number of test cases is " + results.runCount());
	}
}
