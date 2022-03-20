package com.fifth;

import java.util.Scanner;

public class Fifty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();
		int sum=0;

		while (number>0) {
			int mod=number%10;
			sum=sum+(mod*mod*mod);
			number=number/10;
		}
		System.out.println(sum);
	}
}
