package com.six;

import java.util.Scanner;

public class FiftyFour {
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Number :");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter The SecondNumber :");
		int secondNumber = scanner.nextInt();

		for (int i = firstNumber; i <=secondNumber; i++) {
			int count=0;
			for (int j = 2; j <i; j++) {
				if (i%j==0) {
					count++;
					break;
				}	
			}
			if (count==0) {
				System.out.println(i);
			}
		}	
	}
}
