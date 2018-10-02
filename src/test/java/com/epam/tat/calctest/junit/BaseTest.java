package com.epam.tat.calctest.junit;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.epam.tat.module4.Calculator;

/**
 * This class is the parent for all tests. Provides a testing instance,
 * performing creating of Calcelator object
 */
public class BaseTest {

	protected Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
//		System.err.println("********* Calculator created *********");
		Assert.assertNotNull("Calculator object not created!",calculator);
	}

	@After
	public void tearDown() {
		calculator = null;
	}

}
