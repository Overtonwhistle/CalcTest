package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.SubProvider;

public class SubTest extends BaseTest {

	@Test(dataProvider = "subLongData", dataProviderClass = SubProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void sumLongTest(long a, long b, long expectedValue) {
		long result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "subDoubleData", dataProviderClass = SubProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void sumDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}