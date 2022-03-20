package com.third;

import java.util.Scanner;

public class TwentySix {

	public static void main(String[] args) {
		System.out.println("*****km to Miles*****");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The km Value :");
		double mile = scanner.nextDouble();
		System.out.println("The Mile Value Is :"+ (mile*0.621371+" mile"));

		//****************************************************

		System.out.println("*****Centigrade to fahrenheit:*****");
		System.out.println("Enter The Centigrade Value");
		float centigradeValue = scanner.nextFloat();
		float f;
		f=((9*centigradeValue)/5)+32;
		System.out.println("CentigradeValue Is :"+f+"' F");		

		//******************************************************

		System.out.println("*****sqft to acre*****");
		System.out.println("Enter the sqrt :");
		double sqft = scanner.nextDouble();	
		double acre=sqft/43560;
		System.out.println(acre+" acre");

		//*******************************************************	
		
		

	}
}
