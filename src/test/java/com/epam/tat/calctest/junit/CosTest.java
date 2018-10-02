package com.epam.tat.calctest.junit;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CosTest extends BaseTest {

	private double parameter;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForCosDouble() {
		return Arrays.asList(new Object[][]
		{
				{ 0.0, 1 }, // bug
				{ 1.5, cos(1.5) }, // bug
				{ (PI / 3), cos(PI / 3) }, // bug??
				{ (PI / 4), 0.7071067811865475 }, // ok
				{ (PI / 6), sqrt(3) / 2 }, // bug
				{ PI / 2, 0.0 } });
	}

	public CosTest(double parameter, double expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.cos(parameter), 0);
	}

}