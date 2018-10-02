package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.SqrtProvider;

public class SqrtTest extends BaseTest {

	@Test(enabled = false, expectedExceptions = NumberFormatException.class, groups =
	{ "arithmetic", "doubleInputData", "throwingException" })
	// or expect Nan instead of exception??
	public void negativeArgumentTest() {
		calculator.sqrt(-1);
	}

	@Test(dataProvider = "sqrtData", dataProviderClass = SqrtProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void sqrtTest(double a, double expectedValue) {
		double result = calculator.sqrt(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}