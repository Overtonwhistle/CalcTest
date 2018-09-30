package com.epam.tat.calctest.testng;

import org.testng.annotations.Test;

public class CommonTest extends BaseTest {

	@Test
	public void common() {

		System.out.println("Math: " + Math.pow(3, 2.2));
		System.out.println(calculator.pow(3, 2.2));
	}

}
