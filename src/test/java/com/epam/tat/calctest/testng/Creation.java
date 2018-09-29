package com.epam.tat.calctest.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;



public class Creation {
	
	protected Calculator calculator;

	@BeforeClass
	public void setUp() {
		calculator = new Calculator();
	}
	
	@AfterClass
	public void tearDown() {
		calculator = null;
	}

}

