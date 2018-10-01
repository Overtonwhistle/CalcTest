package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class SubProvider {

	@DataProvider(name = "subLongData")
	private Object[][] valuesForSubLong() {
		return new Object[][]
		{
				{ 0, 3, -3 },
				{ 15, -14, 29 },
				{ 0, 0, 0 },
				{ -103, 100, -203 } };
	}

	@DataProvider(name = "subDoubleData")
	private Object[][] valuesForSubDouble() {
		return new Object[][]
		{
				{ 0.0, 3.56, -3.56 },
				{ -12.55, 14.56, -27.11 },
				{ -0, 0.0, 0.0 },
				{ -1.5555, 10.3333, -11.8888 } };
	}

}
