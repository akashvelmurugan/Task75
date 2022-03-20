package com.six;

import java.util.Scanner;

public class FiftyThree {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Number ");
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter The '+''-''*''/'%'");
		char calc = scanner.next().charAt(0);
		System.out.println("Enter The Second Number :");
		double secondNumber = scanner.nextDouble();


		switch (calc) {
		case '+':
			System.out.print(firstNumber+" + "+secondNumber+" = ");
			System.out.println(+firstNumber+secondNumber);
			break;
		case '-':
			System.out.print(firstNumber+" - "+secondNumber+" = ");
			System.out.println(firstNumber-secondNumber);
			break;
		case '*':
			System.out.print(firstNumber+" * "+secondNumber+" = ");
			System.out.println(firstNumber*secondNumber);
			break;
		case '/':
			System.out.print(firstNumber+" / "+secondNumber+" = ");
			System.out.println(firstNumber/secondNumber);
			break;
		case '%':
			System.out.print(firstNumber+" % "+secondNumber+" = ");
			System.out.println(firstNumber%secondNumber);
			break;
		default:
			System.out.println("Enter the Valid Value");
			break;
		}



	}
}
