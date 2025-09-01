package com.java.stringoperations;

import java.util.Scanner;

public class IsAlphabet {
	
	public static  void checkIfCharacterIsAlphabet(char ch) {
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("The entered character '"+ch+"' is an alphabet");
		}else {
			System.out.println("The entered character '"+ch+"' is not an alphabet\"");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char inputChar = scan.next().charAt(0);
		checkIfCharacterIsAlphabet(inputChar);
		scan.close();

	}

}
