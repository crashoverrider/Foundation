package com.java.numericaloperations;

import java.util.Scanner;

public class IsReverseEqualsToOriginal {

	public static boolean checkIfReverseOfANumberIsEqualToOriginal(int number) {

		int rem;		
		int reverse = 0;
		int origin = number;

		while(number>0) {
			rem = number%10;
			number = number/10;
			reverse = (reverse*10)+rem;			
		}
		if(reverse==origin) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		System.out.println(checkIfReverseOfANumberIsEqualToOriginal(inputNumber));
		scan.close();

	}

}
