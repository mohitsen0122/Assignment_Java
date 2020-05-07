package com.practice.java;

enum Month {Jan, Feb;}// We can place semicolon at the end it's optional 
public class EnumExample2 
{
	public static void main(String[] args) 
	{
		Month m = Month.Jan;
		System.out.println(m);
		
		m = Month.Feb;
		System.out.println(m);
	}
}
