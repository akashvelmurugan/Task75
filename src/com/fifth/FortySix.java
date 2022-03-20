package com.fifth;

import java.util.Scanner;

public class FortySix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();
		int sum=0;
		while (number>0) {
			int moduloDivision=number%10;
			sum=(sum*10)+(moduloDivision);
			number=number/10;
		}
		System.out.println(sum);
	}
}
