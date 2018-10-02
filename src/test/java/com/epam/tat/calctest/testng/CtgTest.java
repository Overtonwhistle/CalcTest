package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.CtgProvider;

public class CtgTest extends BaseTest {

	@Test(dataProvider = "ctgData", dataProviderClass = CtgProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void ctgTest(double a, double expectedValue) {
		double result = calculator.ctg(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	
}