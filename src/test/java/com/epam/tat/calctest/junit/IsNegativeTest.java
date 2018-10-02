package com.epam.tat.calctest.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class IsNegativeTest extends BaseTest {

	private long parameter;
	private boolean expectedValue;

	@Parameters
	public static Iterable<Object[]> valuesForIsNegativeLong() {
		return Arrays.asList(new Object[][]
				{
			{ 1, false },
			{ 0, false },
			{ -1, true },
			{ Long.MIN_VALUE, true }, });
	}

	public IsNegativeTest(long parameter, boolean expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Test
	public void cosTest() {
		Assert.assertEquals("Invalid result", expectedValue, calculator.isNegative(parameter));
	}
}