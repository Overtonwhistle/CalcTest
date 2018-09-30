package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class TstCtg extends BaseTest {

	@Test(dataProvider = "ctgData")
	public void ctgTest(double a, double expectedValue) {
		double result = calculator.ctg(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	@DataProvider(name = "ctgData")
	private Object[][] values() {
		return new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, Double.POSITIVE_INFINITY }, // bug
				{ (PI / 6), sqrt(3) }, // bug
				{ (PI / 3), sqrt(3) / 3 }, // bug
				{ (PI / 2), 0.0 } }; // bug
	}

}