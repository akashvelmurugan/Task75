package com.secound;

import java.util.Scanner;

public class Eighteen {
	public static void main(String[] args) {


		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter Your Age :");
		int age = scanner.nextInt();

		String voterEligible=age>=18 ?"ElgigibleForVote":"NotEligibleForVote";

		System.out.println(voterEligible);

		if (age>=18) {
			System.out.println("ElgigibleForVote");
		} else {
			System.out.println("NotEligibleForVote");
		}
	}
}
