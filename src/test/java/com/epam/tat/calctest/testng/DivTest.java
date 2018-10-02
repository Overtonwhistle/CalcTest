package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.DivProvider;

public class DivTest extends BaseTest {

	@Test(expectedExceptions = NumberFormatException.class, groups =
	{ "arithmetic", "longInputData", "throwingException" })
	public void divLongDivByZeroTest() {
		calculator.div(12, 0);
	}

	@Test(dataProvider = "divLongData", dataProviderClass = DivProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void divLongTest(long a, long b, long expectedValue) {
		long result = calculator.div(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "divDoubleData", dataProviderClass = DivProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void divDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.div(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}