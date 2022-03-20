package com.secound;

import java.util.Scanner;

public class Twenty {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Value :");
	int num = scanner.nextInt();
	
	System.out.println("'num' postfixt is "+ ++num);
	System.out.println("current 'num' value"+ num--);
	System.out.println("'num'prefixnumber is"+ --num);

}
}
