package com.simbiosys.javaexam;

public class Swap {

	public static void swap (int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: "+a+" b: "+b);
	}
	public static void main(String[] args) {
		// problem: may overflow
		swap(5,6);
	}

}
