package com.seven;

import java.util.Scanner;

public class SixtyThree {

	public static void main(String[] args) {
		String reverse="";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The sentance :");
		String stringValue = scanner.nextLine();

		String[] split = stringValue.split(" ");

		for (String string : split) {

			reverse=string+" "+reverse;
		}
		System.out.println(reverse);
	}
}	

