package com.fourth;

import java.util.Scanner;

public class ThirtyFour {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The First Number :");
	int firstNumber = scanner.nextInt();
	System.out.println("Enter The Second Number");
	int secondNumber = scanner.nextInt();
	System.out.println("Enter The Third Number :");
	int thirdNumber = scanner.nextInt();
	
	if (firstNumber>secondNumber&&firstNumber>thirdNumber) {
		System.out.println("Largest Number is :"+firstNumber);
	} else if(secondNumber>thirdNumber){
		System.out.println("Largest Number is :"+secondNumber);
	}else {
		System.out.println("Largest Number is :"+thirdNumber);
	}
}
}
