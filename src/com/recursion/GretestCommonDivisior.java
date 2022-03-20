package com.recursion;

import java.util.Scanner;

public class GretestCommonDivisior {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The First Number :");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter The First Number :");
		int secondNumber = scanner.nextInt();

		int result =gretestCommonDivisior(firstNumber,secondNumber);

		System.out.println(result);
	}
	static int gretestCommonDivisior(int firstNumber, int secondNumber) {
		if (firstNumber==0) {
			return secondNumber;
		}	
		if (secondNumber==0) {
			return firstNumber;
		}
		if (firstNumber==secondNumber) {
			return firstNumber;
		}
		if (firstNumber>secondNumber) {
			return gretestCommonDivisior(firstNumber-secondNumber, secondNumber);
		}else {
			return gretestCommonDivisior(firstNumber, secondNumber-firstNumber);
		}
	}
}
