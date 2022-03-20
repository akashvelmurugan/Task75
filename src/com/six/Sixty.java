package com.six;

import java.util.Scanner;

public class Sixty {
	public static void main(String[] args) {


		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Binary Number :");
		int binary = scanner.nextInt();
		
		int count=0;
		int sum=0;
		while (binary!=0) {
		int rem=binary%10;
		
		sum+=rem*Math.pow(2, count);
		count++;
		binary=binary/10;
		}
		System.out.println(sum);
		
		
	}
}