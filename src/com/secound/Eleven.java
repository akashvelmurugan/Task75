package com.secound;

import java.text.DecimalFormat;

public class Eleven {
	public static void main(String[] args) {

		float a=7.50f;

		DecimalFormat decimalFormat=new DecimalFormat("#.00");
		System.out.print(decimalFormat.format(7.50));

	}
}