package com.fourth;

import java.util.Scanner;

public class ThirtySeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Value :");
		
		char characterValue = scanner.next().charAt(0);
		
		if ((characterValue>='a'&&characterValue<='z')||(characterValue>='A'&&characterValue<='Z')) {
			System.out.println(characterValue+" Is Alphapet Value");
		}else {
			System.out.println(characterValue+" Is Not A Alphapet Value");
		}
	}
}
