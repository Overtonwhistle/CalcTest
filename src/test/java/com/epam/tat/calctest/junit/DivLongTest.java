package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DivLongTest extends BaseTest {

	private long parameterA;
	private long parameterB;
	private long expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForDivLong() {
		return Arrays.asList(new Object[][]
		{
				{ 10, 2, 5 },
				{ 3, -1, -3 },
				{ 5, -5, -1 },
				{ 0, 10, 0 }, });
	}

	public DivLongTest(long parameterA, long parameterB, long expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.div(parameterA, parameterB),
				0);
	}
}