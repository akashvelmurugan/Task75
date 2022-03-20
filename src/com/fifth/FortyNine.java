package com.fifth;

import java.util.Scanner;

public class FortyNine {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Number :");
	int number = scanner.nextInt();
	int count=0;
	for (int i = 2; i < number; i++) {
		if (number%i==0) {
			count++;
		}
	}
	if (count==0) {
		System.out.println("Is Prime Number");
	}else {
		System.out.println("Is Not Prime Number");
	}
	
}
}
