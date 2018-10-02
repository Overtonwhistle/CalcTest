package com.epam.tat.calctest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.calctest.testng.provider.TgProvider;

public class TgTest extends BaseTest {

	@Test(dataProvider = "tgData", dataProviderClass = TgProvider.class, groups =
	{ "trigonometric", "doubleInputData" })
	public void tgTest(double a, double expectedValue) {
		double result = calculator.tg(a);
		Assert.assertEquals(result, expectedValue, "Invalid result");
	}

}