package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class IsPositiveTest extends BaseTest {

	private long parameter;
	private boolean expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForIsPositiveLong() {
		return Arrays.asList(new Object[][]
		{
				{ 1, true },
				{ 0, false },
				{ -1, false },
				{ Long.MAX_VALUE, true }, });
	}

	public IsPositiveTest(long parameter, boolean expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.isPositive(parameter));
	}
}