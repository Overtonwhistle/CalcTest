package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.CosProvider;

public class TstCos extends BaseTest {

	@Test(dataProvider = "cosData", dataProviderClass = CosProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void cosTest(double a, double expectedValue) {
		double result = calculator.cos(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	/*
	 * @DataProvider(name = "cosData") private Object[][] valuesForCosDouble() {
	 * return new Object[][] { { 0.0, 1 }, // bug { 1.5, cos(1.5) }, //bug { (PI
	 * / 3), cos(PI / 3) }, // bug?? { (PI / 4), 0.7071067811865475 }, // ok {
	 * (PI / 6), sqrt(3) / 2 }, //bug { PI / 2, 0.0 } }; //bug }
	 */

}