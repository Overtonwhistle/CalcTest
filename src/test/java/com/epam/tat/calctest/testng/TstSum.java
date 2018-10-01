package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TstSum extends BaseTest {

	@Test(dataProvider = "sumLongData")
	public void sumLongTest(long a, long b, long expectedValue) {
		long result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "sumDoubleData")
	public void sumDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "sumLongData")
	private Object[][] valuesForSumLong() {
		return new Object[][]
		{
				{ 0, 3, 3 },
				{ 10, -1, 9 },
				{ 0, 0, 0 },
				{ -1, 10, 9 } };
	}

	@DataProvider(name = "sumDoubleData")
	private Object[][] valuesForSumDouble() {
		return new Object[][]
		{
				{ 0.0, 3.56, 3.56 },
				{ -12.55, 14.56, 2.01 },
				{ -0, 0.0, 0 },
				{ 1.5555, 10.3333, 11.8888 } };
	}

}