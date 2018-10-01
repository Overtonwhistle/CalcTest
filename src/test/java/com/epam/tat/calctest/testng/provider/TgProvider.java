package com.epam.tat.calctest.testng.provider;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

import org.testng.annotations.DataProvider;

public class TgProvider {

	@DataProvider(name = "tgData")
	private Object[][] values() {
		return new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, 0.0 }, // bug
				{ (PI / 3), sqrt(3) }, // bug
				{ (PI / 2), tan((PI / 2)) }, // bug
				{ (PI / 6), sqrt(3) / 3 } // bug
		};
	}
	
}
