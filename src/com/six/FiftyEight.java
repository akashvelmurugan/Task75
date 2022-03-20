package com.six;

import java.util.Scanner;

public class FiftyEight {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();
		int sum=1;
		while (number>0) {
			sum=sum*number;
			number--;
		}
		System.out.println(sum);
	}

}
