package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.CosProvider;

public class CosTest extends BaseTest {

	@Test(threadPoolSize = 3, dataProvider = "cosData", dataProviderClass = CosProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void cosTest(double a, double expectedValue) {
		double result = calculator.cos(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}