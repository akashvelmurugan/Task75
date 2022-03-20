package com.recursion;

import java.util.Scanner;

public class BinaryToOctal {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Binary Value :");
		int number = scanner.nextInt();
		int result=octalNumberCalculation(number);
		System.out.println(result);
	}
	private static int octalNumberCalculation(int number) {
		int decimal=0;
		int octalNumber = 0;
		int count=0;

		while (number!=0) {
			int remainder=number%10;
			decimal+=remainder*Math.pow(2, count);
			count++;
			number/=10;
		}
		int mul=1;
		while (decimal!=0) {
			int remainder=decimal%8;
			octalNumber+=remainder*mul;
			decimal/=8;
			mul*=10;
		}
		return octalNumber;
	}
}
