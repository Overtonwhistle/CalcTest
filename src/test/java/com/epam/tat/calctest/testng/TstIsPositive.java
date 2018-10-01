package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.IsPositiveProvider;

public class TstIsPositive extends BaseTest {

	@Test(dataProvider = "isPositiveData", dataProviderClass = IsPositiveProvider.class, groups =
	{ "arithmetic", "longInputData" })
	public void isPositiveTest(long a, boolean expectedValue) {
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	/*
	 * @DataProvider(name = "isPositiveData") private Object[][]
	 * valuesForIsPositiveDouble() { return new Object[][] { { 1, true }, { 0,
	 * false }, { -1, false }, { Long.MAX_VALUE, true }, }; }
	 */

}