package com.epam.tat.calctest.testng.provider;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

import org.testng.annotations.DataProvider;

public class CosProvider {

	@DataProvider(name = "cosData")
	public Object[][] valuesForCosDouble() {
		return new Object[][]
		{
				{ 0.0, 1 }, // bug
				{ 1.5, cos(1.5) }, //bug
				{ (PI / 3), cos(PI / 3) }, // bug??
				{ (PI / 4), 0.7071067811865475 }, // ok
				{ (PI / 6), sqrt(3) / 2 }, //bug
				{ PI / 2, 0.0 } }; //bug
	}
	
}
