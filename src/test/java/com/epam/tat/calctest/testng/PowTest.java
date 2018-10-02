package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.PowProvider;

public class PowTest extends BaseTest {

	@Test(dataProvider = "powData", dataProviderClass = PowProvider.class, groups =
	{ "arithmetic", "doubleInputData" })
	public void powTest(double a, double b, double expectedValue) {
		double result = calculator.pow(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}