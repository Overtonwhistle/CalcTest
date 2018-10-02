package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SqrtTest extends BaseTest {

	private double parameter;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForSqrtDouble() {
		return Arrays.asList(new Object[][]
		{
				{ 0.0, 0.0 },
				{ 1, 1 },
				{ 121, 11 },
				{ Double.NaN, Double.NaN },
				{ Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
				{ -1, Double.NaN }, // bug ?? or expect an exeption?

		});
	}

	public SqrtTest(double parameter, double expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.sqrt(parameter), 0);
	}
}