package com.simbiosys.javaexam;

import java.io.*;

public class FrequencyOfWord {

	public static int frequency (File file, String word) {

		try {
		FileInputStream fis = new FileInputStream(file);
		byte[] array = new byte[fis.available()];
		fis.read(array);
		String text = new String(array);
		int cnt = 0;
		int start = 0;
		while (start < text.length()) {
			start = text.indexOf(word, start);
			if (start == -1) {
				break;
			}
			++start;
			++cnt;
		}
		
		fis.close();
		
		return cnt;
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(frequency(new File("text"), "a"));
		
	}

}
