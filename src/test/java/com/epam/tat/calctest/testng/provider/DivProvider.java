package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class DivProvider {

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
