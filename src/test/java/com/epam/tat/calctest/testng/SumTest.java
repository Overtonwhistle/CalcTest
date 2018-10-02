package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.SumProvider;

public class SumTest extends BaseTest {

	@Test(dataProvider = "sumLongData", dataProviderClass = SumProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void sumLongTest(long a, long b, long expectedValue) {
		long result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "sumDoubleData", dataProviderClass = SumProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void sumDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}