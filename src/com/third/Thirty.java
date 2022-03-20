package com.third;

import java.util.Scanner;

public class Thirty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//long range
		//9223372036854775807

		long l1=-9223372036854775808l;
		long l2=9223372036854775807l;
		long l3=l2+l2;

		System.out.println(l3);
		System.out.println("Enter The Value :");

		//	long longValue = scanner.nextLong();
		System.out.println("min"+l1);
		System.out.println("max"+l2);
		byte b1=127;
		byte b2=127;
		byte b3=(byte) (b1+1);;
		System.out.println(b3);
	}	
}
