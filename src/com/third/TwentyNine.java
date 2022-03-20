package com.third;

import java.util.Scanner;

public class TwentyNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Number1 Value :");
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter The Number2 Value :");
		double number2 = scanner.nextDouble();
		
		double quotient;
		double remainder;
		
		quotient=number1/number2;
		remainder=number1%number2;
		
		System.out.println("Quotient"+quotient);
		System.out.println("Remainder"+remainder);
		
		
	}

}
