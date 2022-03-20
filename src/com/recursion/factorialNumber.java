package com.recursion;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number :");
		int number = scanner.nextInt();

		int sum=factorialNumber(number);
		System.out.println(sum);
	}

	static int factorialNumber(int num) {
		if (num==0) {
			return 1;
		}else {
			return num*factorialNumber(num-1);	
		}
	}
}
