package com.six;

import java.util.Scanner;

public class FiftySix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = scanner.nextInt();
		int temp=num;
		int array[]=new int[num];
		array[0]=5;
		int intex=0;

		for (int i = 2; i < num; i++) {
			int count=0;
			for (int j = 2; j < i; j++) {

				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				array[intex]=i;
				intex++;
			}
		}         
		//2 3 5 7  11 13 17 19
		System.out.println("Prime Numbers :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]+array[j]==temp) {
					System.out.println(array[i]+"+"+array[j]+"="+num);

				}
			}		
		}
	}
}
