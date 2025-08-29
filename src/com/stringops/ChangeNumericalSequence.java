package com.stringops;

import java.util.Scanner;

public class ChangeNumericalSequence {
	
	public static String sequesnceOfNumbers(String inputString) {
		
		String outputStringwithzeroes = "";
		String outputStringwithones = "";
		
		for(int i = 0;i<= inputString.length()-1;i++) {
			if(inputString.charAt(i)=='0') {
				outputStringwithzeroes = outputStringwithzeroes + inputString.charAt(i);
				
			}else {
				outputStringwithones = outputStringwithones + inputString.charAt(i);
				
			}
		}
		
		String outputString = outputStringwithzeroes + outputStringwithones;
		
		return outputString;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String input = scan.next();
		System.out.println(sequesnceOfNumbers(scan.next()));
		
		

	}

}
