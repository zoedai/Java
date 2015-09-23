package com.simbiosys.training;

public class VariableArguments {

	public static void main(String[] args) {
		int finalResult = 0;
		finalResult = varArgsExample(1,2);
		System.out.println(finalResult);
		
		finalResult = varArgsExample(1,4,2);
		System.out.println(finalResult);
		
		finalResult = varArgsExample(1, 2, 7, 9);
		System.out.println(finalResult);

	}

	public static int varArgsExample(int... x) {
		int result = 0;

		for (int value : x) {
			result += value;
		}
		return result;
	}

}
