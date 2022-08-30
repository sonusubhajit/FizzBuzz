package com.agilekatas.fizzbuzzclasses;

public class FizzBuzz_Features {

	public String getfizzbuzzresult(int number) {

		if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
			return "fizz buzz pop";
		} else if (number % 3 == 0 && number % 5 == 0) {
			return "fizz buzz";
		} else if (number % 3 == 0 && number % 7 == 0) {
			return "fizz pop";
		} else if (number % 5 == 0 && number % 7 == 0) {
			return "buzz pop";
		} else if (number % 2 == 0) {
			return "fuzz";
		} else if (number % 3 == 0) {
			return "fizz";
		} else if (number % 5 == 0) {
			return "buzz";
		} else if (number % 7 == 0) {
			return "pop";
		} else {
			return String.valueOf(number);
		}
	}
}
