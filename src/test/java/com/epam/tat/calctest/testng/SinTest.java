package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.SinProvider;

public class SinTest extends BaseTest {

	@Test(dataProvider = "sinData", dataProviderClass = SinProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void sinTest(double a, double expectedValue) {
		double result = calculator.sin(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}