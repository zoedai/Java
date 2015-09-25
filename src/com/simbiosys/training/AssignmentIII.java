package com.simbiosys.training;

import java.util.Arrays;

public class AssignmentIII {

	// question 1 print duplicate chars from string
	public static char printDuplicate(String a) {
		char[] arr = a.toCharArray();
		int[] counter = new int[256];

		for (int i = 0; i < a.length(); i++) {
			if (counter[arr[i]] > 0) {
				System.out.print(arr[i] + " ");
			}
			counter[arr[i]]++;
		}

		return ' ';
	}

	// question 2 check anagram
	public static boolean isAnagram(String a, String b) {
		if (a == null || b == null || a.length() != b.length()) {
			return false;
		}

		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return (new String(arr1).equals(new String(arr2)));
	}

	// question 3 print first non repeated char
	public static void firstSingle(String a) {
		char[] arr = a.toCharArray();
		int[] counter = new int[256];

		for (int i = 0; i < a.length(); i++) {
			counter[arr[i]]++;
		}

		for (int i = 0; i < a.length(); i++) {
			if (counter[arr[i]] == 1) {
				System.out.println(arr[i]);
				break;
			}
		}

	}

	// question 4 replace blank with %20
	public static String replace(String origin, String a, String b) {
		return origin.replaceAll(a, b);
	}

	// q 5 check palindrome
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}

		return true;
	}

	// q 6 valid shuffle
	public boolean isValidShuffle(String a, String b, String ab) {
		if (a == null || b == null || ab == null
				|| a.length() + b.length() != ab.length()) {
			return false;
		}

		int i = 0;
		int j = 0;

		for (int k = 0; k < ab.length(); k++) {
			if (ab.charAt(k) == a.charAt(i)) {
				++i;
			} else if (ab.charAt(k) == b.charAt(j)) {
				++j;
			} else {
				return false;
			}
		}

		return true;
	}

	// q 7 highest occurrence
	public static char mostFrequent(String s) {
		int[] counter = new int[256]; // number of ascii
		char max = 0;

		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i)]++;
			if (counter[s.charAt(i)] > counter[max]) {
				max = s.charAt(i);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// test 1
		System.out.println("Test 1 ");
		printDuplicate("aabbcdee");
		System.out.println();
		// test 2
		System.out.println("Test 2 ");
		System.out.println(isAnagram("abc", "cba"));
		// test 3

		System.out.println("First single: ");
		// test 4
		System.out.println("Test 4 ");
		String a = "java is fun";
		String b = replace(a, " ", "%20");
		System.out.println("origin: " + a + ", replaced: " + b);
		// test 5
		System.out.println("Test 5");
		String c = "abcba";
		String d = "abcb";
		System.out.println(c + " is palindrome: " + isPalindrome(c));
		System.out.println(d + " is palindrome: " + isPalindrome(d));
		// test 6
		System.out.println("Test 6: first single of abcceeb ");
		firstSingle("abcceeb");
		// test 7
		String e = "//aaac//bbcc";
		System.out.println("Test 7 : Most frequent of " + e + ": " + mostFrequent(e));
	}

}
