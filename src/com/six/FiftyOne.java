package com.six;

import java.util.Scanner;

public class FiftyOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The FirstNumber :");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter The SecondNumber :");
		int secondNumber = scanner.nextInt();

		for (int i = firstNumber; i <= secondNumber; i++) {
			int temp=i;
			int sum=0;
			while (temp>0) {
				int rem=temp%10;
				sum+=(rem*rem*rem);
				temp/=10;
			}
			if (i==sum) {
				System.out.println(i);
			}
		}
	}	
}
