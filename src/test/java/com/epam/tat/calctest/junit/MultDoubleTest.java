package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MultDoubleTest extends BaseTest {

	private double parameterA;
	private double parameterB;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForMultDouble() {
		return Arrays.asList(new Object[][]
				{
			{ 0.0, 3.56, 0 },
			{ -12.55, 0, -0.0 },
			{ -0.0, 0.0, -0.0 },
			{ 0.0, -0.0, -0.0 },
			{ 0.0, 0.0, 0.0 },
			{ 1.55, 10.33, 16.0115 }// bug!!!!!!!!!!!!!!!!!!!

	});
	}

	public MultDoubleTest(double parameterA, double parameterB, double expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.mult(parameterA, parameterB),
				0);
	}
}