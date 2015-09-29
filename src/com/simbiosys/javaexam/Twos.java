package com.simbiosys.javaexam;

public class Twos {

	public static int twos (int num) {
		int numTwo = 0;
		int base = 1;
		
		while (num > 0) {
			numTwo += base * (num % 10) / 2;
			num /= 10;
			base *= 10;
		}
		
		return numTwo;
	}
	public static void main(String[] args) {
		int[] tests = {1,4,10,25,30};
		for (int i : tests) {
			System.out.println(twos(i));

		}

	}

}
