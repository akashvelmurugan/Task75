package com.third;

import java.util.Scanner;

public class Twentyone {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter The 'a' Value :");
	int a = scanner.nextInt();
	
	System.out.println("Enter The 'b' Value :");
	
	int b = scanner.nextInt();
	
	System.out.print("i :");
	System.out.println(++a-b--);
	System.out.print("ii :");
	System.out.println(a%b++);
	System.out.print("iii :");
	System.out.println(a*=b+5);
	System.out.print("iv :");
	
	System.out.println("Enter The 'x ' Value :");

	int x = scanner.nextInt();
	System.out.println(x>>>2);
	
	}
}
