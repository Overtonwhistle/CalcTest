package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TstSub extends BaseTest {

	@Test(dataProvider = "subLongData")
	public void sumLongTest(long a, long b, long expectedValue) {
		long result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "subDoubleData")
	public void sumDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "subLongData")
	private Object[][] valuesForSubLong() {
		return new Object[][]
		{
				{ 0, 3, -3 },
				{ 15, -14, 29 },
				{ 0, 0, 0 },
				{ -103, 100, -203 } };
	}

	@DataProvider(name = "subDoubleData")
	private Object[][] valuesForSubDouble() {
		return new Object[][]
		{
				{ 0.0, 3.56, -3.56 },
				{ -12.55, 14.56, -27.11 },
				{ -0, 0.0, 0.0 },
				{ -1.5555, 10.3333, -11.8888 } };
	}

}