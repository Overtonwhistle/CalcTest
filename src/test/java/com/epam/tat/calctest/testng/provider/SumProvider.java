package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class SumProvider {

	@DataProvider(name = "sumLongData")
	private Object[][] valuesForSumLong() {
		return new Object[][]
		{
				{ 0, 3, 3 },
				{ 10, -1, 9 },
				{ 0, 0, 0 },
				{ -1, 10, 9 } };
	}

	@DataProvider(name = "sumDoubleData")
	private Object[][] valuesForSumDouble() {
		return new Object[][]
		{
				{ 0.0, 3.56, 3.56 },
				{ -12.55, 14.56, 2.01 },
				{ -0, 0.0, 0 },
				{ 1.5555, 10.3333, 11.8888 } };
	}

}
