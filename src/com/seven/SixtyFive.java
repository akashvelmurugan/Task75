package com.seven;

import java.util.Scanner;

public class SixtyFive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Size :");
		int size = scanner.nextInt();

		int a[][]= new int[size][size];
		int b[][]= new int[size][size];
		int c[][]= new int[size][size];

		System.out.println("'a' Matrix :");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter "+i+" and "+j+" Value :");
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("'b' Matrix :");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter "+i+" and "+j+" Value :");
				b[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i <size; i++) {
			for (int j = 0; j <size; j++) {

				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
