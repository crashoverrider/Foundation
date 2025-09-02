package com.java.stringoperations;

import java.util.Scanner;

public class IsVowel {


	public static void checkIfCharacterIsVowel(char ch) {

		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		for(int i=0; i<=vowels.length-1;i++) {
			if(ch==vowels[i]) {
				count++;
				break;
			}
			
		}if(count>0) {
			System.out.println("The character '"+ch+"' is a vowel");
		}else {
			System.out.println("The character '"+ch+"' is a consonant");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char inputString = scan.next().charAt(0);
		checkIfCharacterIsVowel(inputString);
		scan.close();


	}

}