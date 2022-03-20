package com.pattern;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter The Row :");
	int number = scanner.nextInt();

	for (int i = 1; i <= number; i++) {
		for (int j = i; j < number; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");	
		}
		System.out.println();			
	}
}
}