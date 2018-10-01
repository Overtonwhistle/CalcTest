package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.SqrtProvider;

public class TstSqrt extends BaseTest {

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

	/*
	 * @DataProvider(name = "sqrtData") private Object[][] valuesForMultDouble()
	 * { return new Object[][] { { 0.0, 0.0 }, { 1, 1 }, { 121, 11 }, {
	 * Double.NaN, Double.NaN }, { Double.POSITIVE_INFINITY,
	 * Double.POSITIVE_INFINITY }, { -1, Double.NaN }, // bug ?? or expect an
	 * exeption?
	 * 
	 * }; }
	 */

}