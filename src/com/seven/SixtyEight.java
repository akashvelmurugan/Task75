package com.seven;

import java.util.Scanner;

public class SixtyEight {
	static void multiplyTwoMatrices(int[][] a, int[][] b) {
		int c[][]=new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}	
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size = scanner.nextInt();
		int temp=size;

		int a[][]=new int[size][size];
		int b[][]=new int[size][size];


		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter "+i+" and "+j+" Value :");
				a[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter "+i+" and "+j+" Value :");
				b[i][j] = scanner.nextInt();
			}
		}
		multiplyTwoMatrices(a,b);
	}
}	      








