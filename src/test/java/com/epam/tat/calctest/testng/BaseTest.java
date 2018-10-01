package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.epam.tat.module4.Calculator;

/**
 * This class is the parent for all tests. Provides a testing instance,
 * performing creating of Calcelator object
 */
public class BaseTest {

	protected Calculator calculator;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		calculator = new Calculator();
	//	System.err.println("********* Calculator created *********");
		Assert.assertTrue(calculator != null, "Calculator object not created!");
	}

	@AfterMethod
	public void tearDown() {
		calculator = null;
	}

}
