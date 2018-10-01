package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.TgProvider;

public class TstTg extends BaseTest {

	@Test(dataProvider = "tgData", dataProviderClass = TgProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void tgTest(double a, double expectedValue) {
		double result = calculator.tg(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

	/*@DataProvider(name = "tgData")
	private Object[][] values() {
		return new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, 0.0 }, // bug
				{ (PI / 3), sqrt(3) }, // bug
				{ (PI / 2), tan((PI / 2)) }, // bug
				{ (PI / 6), sqrt(3) / 3 } // bug
		};
	}*/

}