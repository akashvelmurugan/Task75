package com.fourth;

import java.util.Scanner;

public class ThirtyTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number Value :");
		int number = scanner.nextInt();

		if (number%2==0) {
			System.out.println("Given Number Is Even");
		}else {
			System.out.println("Given Number Is Odd");
		}



	}
}
