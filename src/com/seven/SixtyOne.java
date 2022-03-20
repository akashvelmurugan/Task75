package com.seven;

import java.util.Scanner;

public class SixtyOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The OctalNumber :");
		int octal = scanner.nextInt();

		int sum=0;
		int count=0;

		while (octal!=0) {
			int rem=octal%10;
			octal=octal/10;
			sum+=rem*Math.pow(8, count);			
			count++;	
		}
		System.out.println(sum);
	}
}

//170

//0=>0*8^0=  0
//7=>7*8^1= 56
//1=>1*8^2= 64
//         ===
//         120