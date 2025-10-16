package com.java.numericaloperations;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {
	
	public  float temperatureConversion(float fahrenheit) {
		float celsius;
		
		celsius = (float) ((fahrenheit-32)/1.8);
		return celsius;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float inputTemperature = scan.nextFloat();
		FahrenheitToCelsiusConversion converter = new FahrenheitToCelsiusConversion();
		System.out.println(converter.temperatureConversion(inputTemperature));
		scan.close();
		

	}

}
