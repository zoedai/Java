package com.simbiosys.training;

import java.util.Arrays;

public class Assignment1 {

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	
	public static void getGrade(int quiz, int mid, int fin) {
		int average = (quiz + mid + fin) / 3;
		String grade;
		
		if (average >= 90) {
			grade = "A";
		} else if (average >= 70) {
			grade = "B";
		} else if (average >= 50) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println("Quiz score: " + quiz);
		System.out.println("Mid-term score: " + mid);
		System.out.println("Final score: " + fin);
		System.out.println("Your grade is " + grade);


		
	}
	
	public static void printNum(int level) {
		for (int i = 1; i <= level; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			for (int j = i; j < level; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printChar() {
		for (int i = 1; i <= 122; i++) {
			System.out.println((char) i);
		}
	}
	
	public static void findZero(int[][] array) {
		if (array == null || array.length == 0) {
			return;
		}
		
		
		boolean leftCorner = array[0][0] == 0;
		
		// store the 0 information in the first row and first column
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if (array[i][j] == 0) {
					array[0][j] = 0;
					array[i][0] = 0;
				}
			}
		}
		
		// fill rows
		for (int i = 1; i < array.length; i++) {
			if (array[i][0] == 0) {
				Arrays.fill(array[i], 0);
			}
		}
		
		// fill columns
		for (int j = 1; j < array[0].length; j++) {
			if (array[0][j] == 0) {
				for (int i = 0; i < array.length; i++) {
					array[i][j] = 0;
				}
			}
		}
		
		// if the first one is zero
		if (leftCorner) {
			for (int i = 0; i < array.length; i++) {
				array[i][0] = 0;
			}
			
			Arrays.fill(array[0], 1);
		}
		
	}
	public static void main(String[] args) {
		// 6
//		System.out.println(sleepIn(false, true));
		
		// 8
		
//		getGrade(90, 70, 50);
		
		// 9
		
//		printNum(7);A
		
		//10
		
		printChar();
		
		//11
		int[][] array = {{2,5,8,4},
				{7,6,3,4},
				{4,7,0,2},
				{1,1,1,1}};
		
		System.out.println("Original: ");
		for (int[] a : array) {
			System.out.println(Arrays.toString(a));
		}

		findZero(array);
		
		System.out.println("After: ");
		for (int[] a : array) {
			System.out.println(Arrays.toString(a));
		}
	}

}
