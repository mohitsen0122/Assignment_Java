package com.practice.java;

public class EnumExampleIndex 
{
	// Defined this enum within class by naming as month
	public enum month {Jan, Feb, Mar, Apr, May} // values are static and final
	public static void main(String[] args) 
	{
		System.out.println("Index Starts from 0 \nUsing ordinal() method we are priting Indexes");
		for(month m : month.values())
		{
			System.out.println(m.ordinal()); // you can print indexs by using in built method ordinal
		}
		
		System.out.println("Index Starts from 0 \nUsing valueOf() method we are priting Indexes");
		System.out.println(month.valueOf("Jan").ordinal());
		System.out.println(month.valueOf("Feb").ordinal());
	}

}
