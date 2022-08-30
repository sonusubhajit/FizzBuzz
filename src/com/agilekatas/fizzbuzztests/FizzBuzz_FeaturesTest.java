package com.agilekatas.fizzbuzztests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.agilekatas.fizzbuzzclasses.FizzBuzz_Features;

public class FizzBuzz_FeaturesTest {

	FizzBuzz_Features fizzbuzzfeature;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Before
	public void setup() {
		fizzbuzzfeature = new FizzBuzz_Features();
	}

	@Test
	public void test_Feature_1_NormalNumbersReturnSameNumber() {
		int[] numbers = { 1, 2, 4 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = String.valueOf(numbers[i]);
			assertEquals(expectedresult, actualresult);
		}
	}

	@Test
	public void test_Feature_1_MultipleofThreeReturnFizz() {
		int[] numbers = { 3, 9, 123 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = "fizz";
			assertEquals(expectedresult, actualresult);
		}

	}

	@Test
	public void test_Feature_1_MultipleofFiveReturnFizz() {
		int[] numbers = { 5, 20, 200 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = "buzz";
			assertEquals(expectedresult, actualresult);
		}
	}

	@Test
	public void test_Feature_1_MultipleofThreeandFiveReturnFizz() {
		int[] numbers = { 15, 45, 315 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = "fizz buzz";
			assertEquals(expectedresult, actualresult);
		}
	}

	@Test
	public void test_Feature_2_MultipleofSevenReturnFizz() {
		int[] numbers = { 7, 28, 77 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = "pop";
			assertEquals(expectedresult, actualresult);
		}
	}

	@Test
	public void test_Feature_2_MultipleofThreeandSevenReturnFizz() {
		int[] numbers = { 21, 63, 126 };
		for (int i = 0; i < numbers.length; i++) {
			String actualresult = fizzbuzzfeature.getfizzbuzzresult(numbers[i]);
			String expectedresult = "fizz pop";
			assertEquals(expectedresult, actualresult);
		}
	}

}
