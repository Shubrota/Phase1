package com.Assignments.TypeCasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO WAP for converting long, float , int => byte , short double.
		

		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println("--------------------------------");
		
		System.out.println("--------Originl Values----------");
		int intNumber = 100;
		long lngNumber =127;
		float floatNumber =129;
		System.out.println("Integer Number :"+intNumber);
		System.out.println("long number    :" + lngNumber);
		System.out.println("float Number   :"+ floatNumber);
		
		System.out.println("-------Converted Number ---------");
		byte byteNumber = (byte) lngNumber;
		System.out.println("Long  to byte :"+ byteNumber);
		short shrtNumber = (short) lngNumber;
		System.out.println("Long  to Short :"+ shrtNumber);
		double dblNumber = lngNumber;
		System.out.println("Long  to Double :"+ dblNumber);
		System.out.println("");
		byteNumber = (byte) floatNumber;
		System.out.println("Float  to byte :"+ byteNumber);
		shrtNumber = (short) floatNumber;
		System.out.println("Float  to Short :"+ shrtNumber);
		dblNumber = floatNumber;
		System.out.println("Float  to Double :"+ dblNumber);
		System.out.println("");
		byteNumber = (byte) intNumber;
		System.out.println("integer  to byte :"+ byteNumber);
		shrtNumber = (short) intNumber;
		System.out.println("integer  to Short :"+ shrtNumber);
		dblNumber = intNumber;
		System.out.println("integer  to Double :"+ dblNumber);
		

	}

}
