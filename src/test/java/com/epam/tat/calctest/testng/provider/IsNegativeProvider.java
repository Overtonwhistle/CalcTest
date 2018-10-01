package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class IsNegativeProvider {

	@DataProvider(name = "isNegativeData")
	private Object[][] valuesForIsNegativeDouble() {
		return new Object[][]
		{
				{ 1, false },
				{ 0, false },
				{ -1, true },
				{ Long.MIN_VALUE, true }, };
	}
	
}
