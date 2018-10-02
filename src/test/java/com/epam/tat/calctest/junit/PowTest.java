package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PowTest extends BaseTest {

	private double parameterA;
	private double parameterB;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForPowDouble() {
		return Arrays.asList(new Object[][]
		{
				{ 0.0, 0.0, 1.0 },
				{ 0.0, 1, 0.0 },
				{ 10.0, 1, 10.0 },
				{ 3, 4, 81 },
				{ 4.0, -2, 0.0625 },
				{ 3.0, 2.2, 11.211578456539659 },

		});
	}

	public PowTest(double parameterA, double parameterB, double expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.pow(parameterA, parameterB),
				0);
	}
}