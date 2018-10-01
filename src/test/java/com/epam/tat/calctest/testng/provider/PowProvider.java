package com.epam.tat.calctest.testng.provider;

import org.testng.annotations.DataProvider;

public class PowProvider {

	@DataProvider(name = "powData")
	private Object[][] valuesForPowDouble() {
		return new Object[][]
		{
				{ 0.0, 0.0, 1.0 },
				{ 0.0, 1, 0.0 },
				{ 10.0, 1, 10.0 },
				{ 3, 4, 81 },
				{ 4.0, -2, 0.0625 },
				{ 3.0, 2.2, 11.211578456539659 }, // is the exponent integer
													// only?

		};
	}
	
}
