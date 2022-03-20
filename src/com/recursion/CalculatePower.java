package com.recursion;

import java.util.Scanner;

public class CalculatePower {

	int num;
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Value :");
		int number = scanner.nextInt();
		System.out.println("Enter The Power :");
		int power = scanner.nextInt();

		int result=calculateThePower(number,power);
		System.out.println(result);
	}
											//5          //3
	private static int calculateThePower(int number, int power) {
	
		if (number==0) {
			return 0;
		}else if (power==0) {
			return 1;
		}else {
			
			return number*calculateThePower(number, power-1);//5*23
		
		} 
	}
}