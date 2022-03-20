package com.six;

import java.util.Scanner;

public class FiftyNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter Second Number : ");
		int secondNumber = scanner.nextInt();

		int min=(firstNumber<secondNumber)?firstNumber:secondNumber;
		
		while (min>1) {

			if ((firstNumber%min==0)&&(secondNumber%min==0)) {
				System.out.println(firstNumber+" and "+secondNumber+" GCD : "+min);
				break;
			}
			min--;
		}
	}
}
// 12/4
//  8/4
