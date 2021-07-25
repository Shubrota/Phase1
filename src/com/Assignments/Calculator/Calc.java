package com.Assignments.Calculator;

import java.io.*;
import java.io.BufferedReader;


public class Calc {

	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=0,b=0,c=0;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first Numnber : ");
		a=Integer.parseInt(br.readLine());
		//System.out.println("a ="+a);
		
		System.out.println("Enter A for Add , S Subtract , M Multiply , D Divide");
		 c= (char) br.read();
		 br.readLine();
		//System.out.println("c  = "+c);
		
		System.out.println("Enter Second Number :");
		
		b=Integer.parseInt(br.readLine());
		
		//System.out.println("b  = "+b);
		
		switch (c) {
		case 'A' : System.out.println(a+b);
		break;
		case 'S': System.out.println(a-b);
		break;
		case 'M': System.out.println(a*b);
		break;
		case 'D': System.out.println(a/b);
		break;
		default:
			System.out.println("Invalid Entry");
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("End");

	}

}
