package com.java.numericaloperations;

import java.util.Scanner;

public class EvenorOdd {
	
	public static void printEvenorOdd(int a) {
		if(a%2==0) {
			System.out.println("The entered number is even");
		}else {
			System.out.println("The entered number is odd");
		}
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);		
		int x = scan.nextInt();
		printEvenorOdd(x);
		scan.close();
		
//		System.out.println("The entered number is " +printEvenorOdd(x));

	}

}
