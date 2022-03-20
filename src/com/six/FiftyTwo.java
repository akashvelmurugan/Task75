package com.six;

import java.util.Scanner;

public class FiftyTwo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				System.out.println(i);
			}
		}
	}
}
