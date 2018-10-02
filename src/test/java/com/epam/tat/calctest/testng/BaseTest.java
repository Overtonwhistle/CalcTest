package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.epam.tat.module4.Calculator;

/**
 * This class is the parent for all tests. Provides a testing instance,
 * performing creating of Calculator object
 */
public class BaseTest {

	protected Calculator calculator;

	@BeforeTest(alwaysRun = true)
	public void setUp() {
		calculator = new Calculator();
		Assert.assertTrue(calculator != null, "Calculator object not created!");
	}

	@AfterTest
	public void tearDown() {
		calculator = null;
	}

}
