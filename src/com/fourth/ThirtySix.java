package com.fourth;

import java.util.Scanner;

public class ThirtySix {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number Value :");

		int number = scanner.nextInt();

		if (number>0) {
			System.out.println(number+" Is Positive Number");
		}else if (number<0) {
			System.out.println(number+"Negative NUmber");
		}else {
			System.out.println("Number Is 0");
		}	
	}

}
