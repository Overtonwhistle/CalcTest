package com.epam.tat.calctest.testng.provider;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import org.testng.annotations.DataProvider;

public class CtgProvider {

	@DataProvider(name = "ctgData")
	private Object[][] valuesForCtgDouble() {
		return new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, Double.POSITIVE_INFINITY }, // bug
				{ (PI / 6), sqrt(3) }, // bug
				{ (PI / 3), sqrt(3) / 3 }, // bug
				{ (PI / 2), 0.0 } }; // bug
	}
	
}
