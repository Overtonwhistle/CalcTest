package com.epam.tat.calctest.junit;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CtgTest extends BaseTest {

	private double parameter;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForCtgDouble() {
		return Arrays.asList(new Object[][]
		{
				{ (PI / 4), 1 }, // ok
				{ 0.0, Double.POSITIVE_INFINITY }, // bug
				{ (PI / 6), sqrt(3) }, // bug
				{ (PI / 3), sqrt(3) / 3 }, // bug
				{ (PI / 2), 0.0 } });
	}

	public CtgTest(double parameter, double expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.ctg(parameter), 0);
	}
}