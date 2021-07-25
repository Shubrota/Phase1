package com.Assignments.TypeCasting;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO :: WAP for string to number value (byte , short , int, long double , float)
        // collect user input from console -> 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number below 127: ");
		String input = scan.nextLine();
		try {
			byte byteNumber = Byte.parseByte(input);
			System.out.println("Byte Number : "+ byteNumber);
			short shortNumber = Short.parseShort(input);
			System.out.println("Short Number : "+ shortNumber);
			int intNumber = Integer.parseInt(input);
			System.out.println("Integer Number : "+ intNumber);
			long longNumber = Long.parseLong(input);
			System.out.println("Long Number : "+ longNumber);
			double dblNumber = Double.parseDouble(input);
			System.out.println("Double Number : "+ dblNumber);
			float floatNumber = Float.parseFloat(input);
			System.out.println("Float Number : "+ floatNumber);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
