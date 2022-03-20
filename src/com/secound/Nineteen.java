package com.secound;

public class Nineteen {
	public static void main(String[] args) {

		//Bitwise'AND'operator
		//0000 1100
		//0001 1001
		//=========
		//0000 1000

		int num11=12;
		int num12=25;
		int result1;
		System.out.println(result1=num11&num12);

		//Bitwisese'OR'operator
		//0000 1100
		//0001 1001
		//=========
		//0001 1101

		int num21=12;
		int num22=25;
		int result2;
		System.out.println(result2=num21|num22);

		//Bitwisese'XOR'operator
		//0000 1100
		//0001 1001
		//==========
		//0001 0101
		int num31=12;
		int num32=25;
		int result3;
		System.out.println(result3=num31^num32);

		//Bitwisese'COMPLEMENT'operatorber

		int number41=35;
		int result4=~number41;
		System.out.println(result4);

		//Rightshift 
		int number51=12;
		int number52=-12;
		System.out.println(number51>>1);
		System.out.println(number52>>1);

		//Leftshift 
		int number61=12;
		int number62=-12;
		System.out.println(number61<<1);
		System.out.println(number62<<1);

		//Unsigned Right Shift 
				int number71=12;
				int number72=-12;
				System.out.println(number71>>1);
				System.out.println(number72>>1);
	}

}
