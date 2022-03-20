package com.fourth;

import java.util.Scanner;

public class ThirtyNine {
	public static void main(String[] args) {
		Scanner scanner= new  Scanner(System.in);

		int sum=1;

		System.out.println("Enter Number Value :");
		int number = scanner.nextInt();

		while (number>=1) {
			sum=sum*number;
			number--;
		}
		System.out.println(sum);	
	}
}
