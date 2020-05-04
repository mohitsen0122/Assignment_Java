package com.practice.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AssignmentDeserialization 
{	
	public static void main(String[] args) 
	{
		try {
		FileInputStream fis = new FileInputStream("/home/mohit/eclipse-workspace_Selenoum/JavaFromBeginners/Files_Serializable/myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		student s = (student) ois.readObject();
		System.out.println(s.id+" \n"+ s.name);
		ois.close();
		fis.close();
		} catch( IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
