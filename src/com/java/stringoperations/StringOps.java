package com.java.stringoperations;

public class StringOps {

	public static void main(String[] args) {
		String sampleString = "This is the String I wanted to print.";
//		System.out.println(sampleString);
		System.out.println(sampleString.charAt(13));
		System.out.println(sampleString.contains("String"));
		System.out.println(sampleString.indexOf('I'));
		System.out.println(sampleString.indexOf("String"));
		System.out.println(sampleString.indexOf('t', 15));
		System.out.println(sampleString.lastIndexOf('e'));
		

	}

}
