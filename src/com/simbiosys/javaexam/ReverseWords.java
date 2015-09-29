package com.simbiosys.javaexam;

public class ReverseWords {

	// solution 1 : in place
	public static String reverse(String s) {
		s = s.trim();
		char[] chars = s.toCharArray();
		
		//1. reverse whole string
		int i = 0, j = s.length() - 1;
		reverse(chars, i, j);
		
		// 2. reverse each word
		i = 0;
		j = 1;
		
		while (i < s.length() && j < s.length()) {
			if (chars[i] == ' ') {
				++i;
				++j;
				continue;
			}
			
			if (chars[j] == ' ') {
				reverse(chars, i, j-1);
				i = j + 1;
				j = i + 1;
			} else {
				++j;
			}
		}
		
		reverse(chars, i, j - 1);
		return new String(chars);
	}
	
	private static void reverse(char[] arr, int i, int j) {
		while (i < j) {
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			++i;
			--j;
		}
	}
	
	// solution 2 : StringBuilder
	
	public static String reverseWord(String s) {
		s = s.trim();
		String[] strArray = s.split(" ");
		StringBuilder sb = new StringBuilder(s.length());
		
		for (int i = strArray.length - 1; i > 0; --i) {
			sb.append(strArray[i] + " ");
		}
		
		sb.append(strArray[0]);
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String test = "My first class is Java";
		System.out.println("Origin String: " + test);
		System.out.println(reverse(test));
		System.out.println(reverseWord(test));
	}

}
