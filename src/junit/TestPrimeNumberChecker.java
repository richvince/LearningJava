/*
Copyright 2010 kiddy
*/
package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPrimeNumberChecker {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	public TestPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize() {
		this.primeNumberChecker = new PrimeNumberChecker();
	}
	
	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][]{
				{2, true},
				{6, false},
				{19, true},
				{22, false},
				{23, true}
		});
	}
	
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized number is " + inputNumber);
		Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}
}
