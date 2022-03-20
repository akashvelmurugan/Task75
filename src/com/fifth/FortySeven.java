package com.fifth;

import java.util.Scanner;

public class FortySeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Base Number:");
		int base = scanner.nextInt();
		System.out.println("Enter The Exponent Number:");
		int exponent = scanner.nextInt();

		int result=1;

		for (int i = 0; i < exponent; i++) {
			result*=base;		
		}

		System.out.println(result);
	}
}
