package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SubDoubleTest extends BaseTest {

	private double parameterA;
	private double parameterB;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForSubDouble() {
		return Arrays.asList(new Object[][]
		{
				{ 0.0, 3.56, -3.56 },
				{ -12.55, 14.56, -27.11 },
				{ -0, 0.0, 0.0 },
				{ -1.5555, 10.3333, -11.8888 } });
	}

	public SubDoubleTest(double parameterA, double parameterB, double expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.sub(parameterA, parameterB),
				0);
	}
}