package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class MultProvider {

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
