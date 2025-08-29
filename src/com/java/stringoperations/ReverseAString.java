package com.java.stringoperations;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseAString {
	
	public static String stringReverse(String inputString) {
		
		int stringLength = inputString.length();
		String reverseString = "";
		
		for(int i=stringLength-1;i>=0;i--) {
			
			reverseString = reverseString + inputString.charAt(i);
						
		}
		return reverseString;
		
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String inputString = scan.next();
		System.out.println(stringReverse(inputString));
		scan.close();

	}

}
