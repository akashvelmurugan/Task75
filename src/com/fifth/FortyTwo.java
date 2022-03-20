package com.fifth;

import java.util.Scanner;

public class FortyTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Integer Value :"); 
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		int number=0;

		for (int i = 1; i <=n1; i++) {
			if (n1%i==0&&n2%i==0) {
				
				number=i;
			}
			
		}
		System.out.println(number);
	}

}
