package com.third;

import java.util.Scanner;

public class TwentyThree {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 'x' Value : ");
		int x = scanner.nextInt();

		x = x++ * 2 + 3 * - x;
		System.out.println(x);



	}
}
