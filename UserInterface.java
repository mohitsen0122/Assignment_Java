package com.database.insertion;

import java.io.File;
import java.util.Scanner;


public class UserInterface 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		String photoPath = "/home/mohit/eclipse-workspace/MobileProducts/image/pro4.jpg";
		System.out.println("Enter details");
		File file = new File(photoPath);
		
		String name = sc.next();
		int price = sc.nextInt();
		
		String desc = sc.next();
		int rating = sc.nextInt();
		ProductDetails prodDetials = new ProductDetails( name, price, desc, rating);
		prodDetials.setImage(file);
		
		new RegisterDriver().jdbcConnection(prodDetials);
	}
}

