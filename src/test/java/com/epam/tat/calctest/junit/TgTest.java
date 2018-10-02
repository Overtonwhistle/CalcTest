package com.epam.tat.calctest.junit;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TgTest extends BaseTest {

	private double parameter;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForTgDouble() {
		return Arrays.asList(new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, 0.0 }, // bug
				{ (PI / 3), sqrt(3) }, // bug
				{ (PI / 2), tan((PI / 2)) }, // bug
				{ (PI / 6), sqrt(3) / 3 } // bug
		});
	}

	public TgTest(double parameter, double expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.tg(parameter), 0);
	}
}