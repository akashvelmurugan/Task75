package com.pattern;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Row Value :");
		int number =scanner.nextInt() ;
		
		
		
		for (int i = number; i >=1; i--) {
			for (int j = number; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = i; j >=1; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
