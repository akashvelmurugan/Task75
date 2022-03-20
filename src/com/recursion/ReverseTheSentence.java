package com.recursion;

import java.util.Scanner;

public class ReverseTheSentence {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The String Value :");
		String string = scanner.nextLine();
		String answer=reverseASentenceUsingRecursion(string);
		System.out.println(answer);
	}
	static String reverseASentenceUsingRecursion(String string) {
		if (string.isEmpty()) {
			return string;
		}else {
			return reverseASentenceUsingRecursion(string.substring(1))+string.charAt(0);
		}
	}
}