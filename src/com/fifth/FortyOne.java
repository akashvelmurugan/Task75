package com.fifth;

import java.util.Scanner;

public class FortyOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Number Value :");
		int number = scanner.nextInt();

		int a=0;
		int b=1;
		int c;
		for (int i = 0; i <number ; i++) {
			System.out.println(c=a+b);
			a=b;
			b=c;


		}

	}


}
