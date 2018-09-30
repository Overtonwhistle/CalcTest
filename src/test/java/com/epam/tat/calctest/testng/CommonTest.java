package com.epam.tat.calctest.testng;

import org.testng.annotations.Test;

public class CommonTest extends BaseTest {

	@Test
	public void common() {

		System.out.println("Math: " + Math.tan((Math.PI/2)));
		System.out.println(calculator.tg((0)));
	}

}
