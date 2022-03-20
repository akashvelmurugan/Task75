package com.seven;

import java.util.Scanner;

public class SixtyFour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number :");

		int number = scanner.nextInt();

		System.out.println("Enter The power :");
		int power = scanner.nextInt();


		int sum=1;

		while (power>0) {	
			sum*=number;
			power--;
		}
		System.out.println(sum);
	}
}
