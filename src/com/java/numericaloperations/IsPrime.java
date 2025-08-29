package com.java.numericaloperations;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num =  scan.nextInt();
		int count = 0;


		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==1) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
		scan.close();

	}

}
