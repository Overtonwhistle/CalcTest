package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

/**
 * This class is the parent for all tests. Provides a testing instance,
 * performing creating of Calculator object
 */
public class BaseTest {

	protected Calculator calculator;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		calculator = new Calculator();
		Assert.assertTrue(calculator != null, "Calculator object not created!");
	}

	@AfterClass
	public void tearDown() {
		calculator = null;
	}

}
