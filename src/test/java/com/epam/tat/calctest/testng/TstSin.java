package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.sin;

public class TstSin extends BaseTest {

	@Test(dataProvider = "sinData")
	public void sinTest(double a, double expectedValue) {
		double result = calculator.sin(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "sinData")
	private Object[][] valuesForSinDouble() {
		return new Object[][]
		{
				{ 0.0, 0.0 },
				{ 1.5, 0.9974949866040544 },
				{ (PI / 6), sin(PI / 6) },
				{ (PI / 4), 0.7071067811865475 },
				{ (PI / 3), sqrt(3) / 2 },
				{ PI / 2, 1 },
				{ -1.0, -0.8414709848078965 } };
	}

}