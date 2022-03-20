package com.fifth;

import java.util.Scanner;

public class FortyThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ente The First Number :");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter The Second Number :");
		int secondNumber = scanner.nextInt();

		int max=secondNumber>firstNumber? secondNumber:firstNumber;
		int min=secondNumber<firstNumber? secondNumber:firstNumber;

		if (max%min==0) {
			System.out.println(max);
		}else if ((max*2)%min==0) {
			max=max*2;
			System.out.println(max);
		}else{
			System.out.println(max);
		}
	}
}



