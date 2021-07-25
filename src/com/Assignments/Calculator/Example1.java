package com.Assignments.Calculator;


public class Example1 {

	public static void main(String[] args) {
		// TODO :: WAP for converting int , byte , short  => float , double , long.

		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println("--------------------------------");
		
		System.out.println("--------Originl Values----------");
		int intNumber = 100;
		byte byteNumber =127;
		short shortNumber =129;
		System.out.println("Integer Number :"+intNumber);
		System.out.println("Byte number    :" + byteNumber);
		System.out.println("Short Number   :"+ shortNumber);
		
		System.out.println("-------Converted Number ---------");
		float fltNumber = intNumber;
		System.out.println("Integer to float :"+ fltNumber);
		fltNumber = byteNumber;
		System.out.println("Byte to float :"+ fltNumber);
		fltNumber = shortNumber;
		System.out.println("Short  to float :"+ fltNumber);
		
		double dblNumber = intNumber;
		System.out.println("Integer to double :"+ dblNumber);
		dblNumber = byteNumber;
		System.out.println("Byte to double :"+ dblNumber);
		dblNumber = shortNumber;
		System.out.println("Short  to double :"+ dblNumber);
		
		long lngNumber = intNumber;
		System.out.println("Integer to long :"+ lngNumber);
		lngNumber = byteNumber;
		System.out.println("Byte to long :"+ lngNumber);
		lngNumber = shortNumber;
		System.out.println("Short  to long :"+ lngNumber);
		
		

	}

}
