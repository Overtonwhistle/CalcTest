package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.MultProvider;

public class MultTest extends BaseTest {

	@Test(enabled = true,
		dataProvider = "multLongData",
		dataProviderClass = MultProvider.class,
		groups =
		{ "arithmetic", "longInputData" })
	public void multLongTest(long a, long b, long expectedValue) {
		long result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "multDoubleData", dataProviderClass = MultProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void multDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}