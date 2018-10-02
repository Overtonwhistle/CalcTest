package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class IsPositiveProvider {

	@DataProvider(name = "isPositiveData")
	private Object[][] valuesForIsPositiveLong() {
		return new Object[][]
		{
				{ 1, true },
				{ 0, false },
				{ -1, false },
				{ Long.MAX_VALUE, true }, };
	}
	
}
