package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TstMult extends BaseTest {

	@Test(enabled = true, dataProvider = "multLongData")
	public void multLongTest(long a, long b, long expectedValue) {
		long result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "multDoubleData")
	public void multDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "multLongData")
	private Object[][] valuesForMultLong() {
		return new Object[][]
		{
				{ 10, 0, 0 },
				{ 0, -10, 0 },
				{ 0, 0, 0 },
				{ -12, 10, -120 },
				{ 2, -14, -28 } };
	}

	@DataProvider(name = "multDoubleData")
	private Object[][] valuesForMultDouble() {
		return new Object[][]
		{
				{ 0.0, 3.56, 0 },
				{ -12.55, 0, -0.0 },
				{ -0.0, 0.0, -0.0 },
				{ 0.0, -0.0, -0.0 },
				{ 0.0, 0.0, 0.0 },
				{ 1.55, 10.33, 16.0115 }// bug!!!!!!!!!!!!!!!!!!!

		};
	}

}