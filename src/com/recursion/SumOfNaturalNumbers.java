package com.recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	static int SumOfNaturalNumbers(int num) {

		if (num==0) {
			return 0;
		}else {
			return num+SumOfNaturalNumbers(num-1);
		}
	}
	public static void main(String[] args) {

		System.out.println("Enter Value :");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int sum=SumOfNaturalNumbers(number);

		System.out.println(sum);

	}	
}
