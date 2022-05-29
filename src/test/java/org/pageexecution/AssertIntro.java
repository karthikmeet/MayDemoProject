package org.pageexecution;

import org.junit.Assert;
import org.junit.Test;

public class AssertIntro {
	@Test
	public void test1() {

		String Expected = "Facebook helps you connect and share with the people in your life.";
		String Actual = "helps you connect and share with the people in your life.";
		// It should be taken from Web element get text

		Assert.assertTrue(Actual.contains(Expected));
	}

	@Test
	public void test2() {
		String Expected = "Facebook helps you connect and share with the people in your life.";
		String Actual = "Facebook helps you connect and share with the people in your life.";
		// It should be taken from Web element get text

		Assert.assertTrue("This test case has been failed", Actual.contains(Expected));
	}
}
