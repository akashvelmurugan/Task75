package com.pattern;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Row :");
		//  int number = scanner.nextInt();
		int number=9;

		for (int i = number; i >=1; i--) {
			for (int j = i; j >1; j--) {
				System.out.print(" ");
			}
			for (int j=i;j<=number;j++) {
				System.out.print(j);
			}
			for (int j = number-1; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
