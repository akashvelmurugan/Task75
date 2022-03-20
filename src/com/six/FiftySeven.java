	package com.six;

import java.util.Scanner;

public class FiftySeven {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = scanner.nextInt();

		int sum=0;
		
		//int num=6;
		//6+5+4+3+2+1=21
		
		while (num>0) {
			sum=num+sum;
			num--;
		}
		System.out.println(sum);		
	} 

}
