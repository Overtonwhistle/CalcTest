package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TstIsPositive extends BaseTest {

	@Test(dataProvider = "isPositiveData")
	public void isPositiveTest(long a, boolean expectedValue ) {
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "isPositiveData")
	private Object[][] values() {
		return new Object[][]
		{
				{ 1, true },
				{ 0, false },
				{ -1, false },
				{ Long.MAX_VALUE, true }, };
	}

}