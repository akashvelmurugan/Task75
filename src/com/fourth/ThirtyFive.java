package com.fourth;

import java.util.Scanner;

public class ThirtyFive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Value :");
		double a = scanner.nextDouble();

		System.out.println("Enter The Value :");
		double b = scanner.nextDouble();

		System.out.println("Enter The Value :");
		double c = scanner.nextDouble();


		double root1, root2;

		// calculate the x = (b^2 - 4ac)
		double x = b * b - 4 * a * c;
		double sqreOfxValue=Math.sqrt(x);

		if (x>0) {
			double positiveValue=(-b-x)/(2*a);
			double negativeValue=(-b-x)/(2*a);
			System.out.println(positiveValue);
			System.out.println(negativeValue);
		}   else if(x==0){
			double positiveValue=(-b-x)/(2*a);
			System.out.println(positiveValue);
		}else {
			System.out.println("Imaginary");
		}	
	}
}		


