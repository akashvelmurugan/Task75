package com.third;

import java.util.Scanner;

public class TwentySeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Year");
		int year = scanner.nextInt();

		if (year%4==0||year%400==0) {
			System.out.println(year+"Is Leap Year");
		}else {
			System.out.println(year+"Is Leap Not Year");
		}
	}
}
