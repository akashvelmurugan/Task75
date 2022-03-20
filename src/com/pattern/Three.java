package com.pattern;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);

		System.out.println("Enter The Value :");

		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = i; j < number; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}		
	}

}
