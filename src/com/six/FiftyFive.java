package com.six;

import java.util.Scanner;

public class FiftyFive {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();

		int temp=number;
		int number2=number;
		int ArmsTrongNumber=0;

				while (number>0) {
					int mod=number%10;
					ArmsTrongNumber=ArmsTrongNumber+(mod*mod*mod);
					number=number/10;
				}
				if (temp==ArmsTrongNumber) {
					System.out.println(temp+" Armstrong Number");
				}else {
					System.out.println(temp+" Is Not Armstrong Number");
				}

		int count=0;
		for (int i = 2; i < number2; i++) {
			if (number2%i==0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println(number2+" Is Prime Number");
		}else {
			System.out.println(number2+" Is Not Prime Number");
		}

		//		
	}
}
