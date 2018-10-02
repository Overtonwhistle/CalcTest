package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MultLongTest extends BaseTest {

	private long parameterA;
	private long parameterB;
	private long expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForMultLong() {
		return Arrays.asList(new Object[][]
		{
				{ 10, 0, 0 },
				{ 0, -10, 0 },
				{ 0, 0, 0 },
				{ -12, 10, -120 },
				{ 2, -14, -28 } });
	}

	public MultLongTest(long parameterA, long parameterB, long expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue,
				calculator.mult(parameterA, parameterB), 0);
	}
}