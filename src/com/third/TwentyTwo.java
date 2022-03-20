package com.third;

import java.util.Scanner;

public class TwentyTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The 'a' Value : ");
		//float a = scanner.nextFloat();
		double a = scanner.nextDouble();

		a+=a++ + ++a + -a + a--;

		System.out.println(a);

	}
}
