package com.java.numericaloperations;

import java.util.Scanner;

public class CelsiusToFahrenheitConversion extends FahrenheitToCelsiusConversion {
	
	@Override
	public  float temperatureConversion(float celcius){		
		float fahrenheit;
		
		fahrenheit = (float) (celcius*1.8)+32;
		return fahrenheit;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float inputTemperature = scan.nextFloat();
		FahrenheitToCelsiusConversion polyConverter = new CelsiusToFahrenheitConversion();
		System.out.println(polyConverter.temperatureConversion(inputTemperature));
		scan.close();

	}

}
