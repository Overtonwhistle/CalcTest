package com.epam.tat.calctest.junit;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SinTest extends BaseTest {

	private double parameter;
	private double expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForSinDouble() {
		return Arrays.asList(new Object[][]
		{
				{ 0.0, 0.0 },
				{ 1.5, 0.9974949866040544 },
				{ (PI / 6), sin(PI / 6) },
				{ (PI / 4), 0.7071067811865475 },
				{ (PI / 3), sqrt(3) / 2 },
				{ PI / 2, 1 },
				{ -1.0, -0.8414709848078965 } });
	}

	public SinTest(double parameter, double expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.sin(parameter), 0);
	}
}