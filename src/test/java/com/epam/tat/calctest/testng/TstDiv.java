package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TstDiv extends BaseTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void divLongDivByZeroTest() {
		calculator.div(12, 0);
	}

	@Test(enabled = false, dataProvider = "divLongData")
	public void divLongTest(long a, long b, long expectedValue) {
		long result = calculator.div(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@Test(dataProvider = "divDoubleData")
	public void divDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.div(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "divLongData")
	private Object[][] valuesForDivLong() {
		return new Object[][]
		{
				{ 10, 2, 5 },
				{ 3, -1, -3 },
				{ 5, -5, -1 },
				{ 0, 10, 0 }, };
	}

	@DataProvider(name = "divDoubleData")
	private Object[][] valuesForMultDouble() {
		return new Object[][]
		{
				{ 0.0, 13.56, 0 },
				{ -12.55, 0.0, Double.NEGATIVE_INFINITY },
				{ 10.0, 0.0, Double.POSITIVE_INFINITY },
				{ -0.0, -0.0, Double.NaN },
				{ 0.0, -0.0, Double.NaN },
				{ 7.8, 0.25, 31.2 },
				{ -0.5758, 0.016, -35.9875 },
				{ 4042.66, -144.22, -28.031202329773954 },

		};
	}

}