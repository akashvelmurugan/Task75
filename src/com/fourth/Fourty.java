package com.fourth;

import java.util.Scanner;

public class Fourty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1");

		int number = scanner.nextInt();


		for (int i = 1; i <=10; i++) {

			System.out.println(i+"*"+number+"="+(i*number));
		}


	}
}
