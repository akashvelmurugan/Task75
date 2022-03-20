package com.seven;

import java.util.Scanner;

public class SixtySix {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Size : ");
		int size = scanner.nextInt();

		int[][] a=new int[size][size];
		int[][] b=new int[size][size];
		int[][] result=new  int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter The Value "+i+" "+j);
				a[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter The Value "+i+" "+j);
				b[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					result[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

