package com.practice.java;
// Shallow Cloning of Object
class T1
{
	int a = 1;
	int b = 2;
}
class ShallowClone implements Cloneable // Cloneable interface must be implements 
{
	int x;
	int y;
	T1 sc = new T1();
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class ObjectCloning 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ShallowClone objsc = new ShallowClone();
		objsc.x = 10;
		objsc.y = 20;
		
		
		
		ShallowClone objnew = (ShallowClone)objsc.clone();
		objnew.x = 1;
		objnew.sc.a = 1000; // This will reflect on both object that's why it is shallow copy 
		// Using "objsc" Object
		System.out.println(objsc.x+" "+objsc.y+" "+objsc.sc.a+" "+objsc.sc.b);
		//Using "objnew" Object
		System.out.println(objnew.x+" "+objnew.y+" "+objnew.sc.a+" "+objnew.sc.b);
	
	}
}
