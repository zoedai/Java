package com.simbiosys.training;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	
	public static void chooseAnswer() {
		System.out.print("What is the correct way to declare"
				+ "a variable to store an integer value in Java?\n"
				+ "a. int 1x=10;\n"
				+ "b. int x=10\n;"
				+ "c. float x=10.0f;\n"
				+ "d. string x=\"10\";\n"
				+ "Enter your choice: ");
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String ans = sc.next();
			if (ans.equals("b") || ans.equals("B")) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.println("Please try again.");
			}
		}
		
		sc.close();
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
		
		
		boolean[] cols = new boolean[array[0].length];
		boolean[] rows = new boolean[array.length];
		
		// store the 0 information in the first row and first column
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == 0) {
					cols[j] = true;
					if (i + 1 < array.length) {
						rows[i + 1] = true;
					}
				}
			}
		}
		
		// fill rows
		for (int i = 1; i < array.length; i++) {
			if (rows[i]) {
				Arrays.fill(array[i], 0);
			}
		}
		
		// fill columns
		for (int j = 1; j < array[0].length; j++) {
			if (cols[j]) {
				for (int i = 0; i < array.length; i++) {
					array[i][j] = 0;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// 6
//		System.out.println(sleepIn(false, true));
		
		// 7
		
		chooseAnswer();
		
		// 8
		
//		getGrade(90, 70, 50);
		
		// 9
		
//		printNum(7);A
		
		//10
		
//		printChar();
		
		//11
/*		int[][] array = {{2,5,8,4},
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
		*/
	}
	


}
