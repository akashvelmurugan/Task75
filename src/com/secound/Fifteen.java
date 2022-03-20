package com.secound;

import java.util.Scanner;

//polynomial equation
public class Fifteen {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 'A' Value");
		double aValue = scanner.nextDouble();
		System.out.println("Enter 'B' Value");
		double bValue = scanner.nextDouble();
		System.out.println("Enter C'Value");
		double cValue = scanner.nextDouble();

		//x=b^2-4ac
		double x=bValue*bValue-4*aValue*cValue;
		
		if (x>0) {
			double positive=-bValue+Math.pow(x, 0.5)/(2*aValue);
			double negative=-bValue-Math.pow(x, 0.5)/(2*aValue);
		}else if (x==0) {
			double positive=-bValue/(2*aValue);
		}else {
			System.out.println("Roots are Imaginary");
		}


	}
}
