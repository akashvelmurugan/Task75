package com.fourth;

import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter THe First Number :");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter The Second Number :");
		int secondNumber = scanner.nextInt();
		
		System.out.println("First Number  :"+firstNumber);
		System.out.println("Second Number :"+secondNumber);
		
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		System.out.println("First Number  :"+firstNumber);
		System.out.println("Second Number :"+secondNumber);
	}

}
