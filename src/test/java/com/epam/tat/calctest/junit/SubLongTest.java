package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SubLongTest extends BaseTest {

	private long parameterA;
	private long parameterB;
	private long expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForSubLong() {
		return Arrays.asList(new Object[][]
		{
				{ 0, 3, -3 },
				{ 15, -14, 29 },
				{ 0, 0, 0 },
				{ -103, 100, -203 } });
	}

	public SubLongTest(long parameterA, long parameterB, long expectedValue) {
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