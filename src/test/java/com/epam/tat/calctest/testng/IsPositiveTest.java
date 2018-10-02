package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.IsPositiveProvider;

public class IsPositiveTest extends BaseTest {

	@Test(dataProvider = "isPositiveData", dataProviderClass = IsPositiveProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void isPositiveTest(long a, boolean expectedValue) {
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}