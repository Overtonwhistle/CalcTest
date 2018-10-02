package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SumLongTest extends BaseTest {

	private long parameterA;
	private long parameterB;
	private long expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForSumLong() {
		return Arrays.asList(new Object[][]
		{
				{ 0, 3, 3 },
				{ 10, -1, 9 },
				{ 0, 0, 0 },
				{ -1, 10, 9 } });
	}

	public SumLongTest(long parameterA, long parameterB, long expectedValue) {
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.sum(parameterA, parameterB),
				0);
	}
}