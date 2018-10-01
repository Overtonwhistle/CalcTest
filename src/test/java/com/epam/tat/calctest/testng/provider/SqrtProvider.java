package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class SqrtProvider {

	@DataProvider(name = "sqrtData")
	private Object[][] valuesForMultDouble() {
		return new Object[][]
		{
				{ 0.0, 0.0 },
				{ 1, 1 },
				{ 121, 11 },
				{ Double.NaN, Double.NaN },
				{ Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
				{ -1, Double.NaN }, // bug ?? or expect an exeption?

		};
	}

}
