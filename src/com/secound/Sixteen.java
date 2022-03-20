package com.secound;

import java.util.Scanner;

public class Sixteen {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	float p=22/7;
	float result;



	System.out.println("Enter The 'r' Value");
	float r1 = scanner.nextFloat();
	float Circle1result;
	System.out.println(Circle1result=p*r1*r1);

	System.out.println("Enter the 'r2' Value");
	float r2 = scanner.nextFloat();
	float Circle2result;
	System.out.println(Circle2result=p*r2*r2);

	result=Circle2result-Circle1result;
	System.out.println("area of the space between the circle"+result);
}

}
