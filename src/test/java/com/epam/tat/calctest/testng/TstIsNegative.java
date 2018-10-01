package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.IsNegativeProvider;

public class TstIsNegative extends BaseTest {

	@Test(dataProvider = "isNegativeData", dataProviderClass = IsNegativeProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void isNegativeTest(long a, boolean expectedValue) {
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	/*@DataProvider(name = "isNegativeData")
	private Object[][] valuesForIsNegativeDouble() {
		return new Object[][]
		{
				{ 1, false },
				{ 0, false },
				{ -1, true },
				{ Long.MIN_VALUE, true }, };
	}*/

}