package com.fifth;

import java.util.Scanner;

public class FortyEight {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Number :");
	int number = scanner.nextInt();
	int sum=0;
	int temp =number;
	
	while (number>0) {
		int moduloDivision=number%10;
		sum=sum*10+moduloDivision;
		number/=10;
	}
	
	if (sum==temp) {
		System.out.println(temp+" Is Palindrome");
	}else {
		System.out.println(temp+" The Number Is Not Palindrome");
	}

}
}
