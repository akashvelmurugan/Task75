package com.seven;

import java.util.Scanner;

public class SixtySeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Size :");
		int size = scanner.nextInt();
		int a[][]= new int[size][size];
		int transpose[][]=new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter "+i+" and "+j);
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println(" 'a' Matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("'transpose' Matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				transpose[i][j]=a[j][i];
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
