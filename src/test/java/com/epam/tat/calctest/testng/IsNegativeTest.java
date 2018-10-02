package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.IsNegativeProvider;

public class IsNegativeTest extends BaseTest {

	@Test(dataProvider = "isNegativeData", dataProviderClass = IsNegativeProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void isNegativeTest(long a, boolean expectedValue) {
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}