package com.secound;

import java.util.Scanner;

public class Seventeen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 'i' Value :");
		int i = scanner.nextInt();
		
		System.out.println("'i' value is :"+ i);
		System.out.println("'i' value is :"+ i++);
		System.out.println("'i' value is :"+ ++i);
		System.out.println("-----------------------------------");

		System.out.println("'i' value is :"+ i--);
		System.out.println("'i' value is :"+ --i);
	}
}
