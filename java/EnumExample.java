package com.practice.java;

public class EnumExample 
{
	// Defining the enum inside the class
	public enum Season{Monday, Tuesday,  Wednesday} // values present in Season enum
	public static void main(String[] args) 
	{
		// traversing the enum by using for each 
		for(Season s : Season.values())
		{
			System.out.println(s); // It will print values
		}
	}
}
