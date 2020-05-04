package com.practice.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student  implements Serializable
{
	int id;
	String name;
	public student(int a, String b)
	{
		this.id = a;
		this.name = b;
	}
}
public class AssigmnetSerializable
{
	public static void main(String[] args) 
	{
		student s1 =new student(211,"Mohit");
		try
		{
			FileOutputStream fos = new FileOutputStream("/home/mohit/eclipse-workspace_Selenoum/JavaFromBeginners/Files_Serializable/myfile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Success");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
