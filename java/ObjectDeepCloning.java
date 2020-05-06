package com.practice.java;
class DeepClone
{
	int x = 10;
	int y = 20;
}
class Demo implements Cloneable 
{
	int one = 1;
	int two = 2;
	DeepClone dc = new DeepClone();
	public Object clone() throws CloneNotSupportedException
	{
		Demo d = (Demo)super.clone();
		d.dc = new DeepClone();
		return d;
	}
}
public class ObjectDeepCloning 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Demo d = new Demo();
		d.one = 10;
		d.two = 20;
		
		Demo objnew = (Demo)d.clone();
		objnew.one = 11;
		objnew.dc.x = 1000;
		 
		 // This will reflect on both object that's why it is deep copy 
		// Using "objsc" Object
		System.out.println(d.one+" "+d.two+" "+d.dc.x  +" "+d.dc.y );
		//Using "objnew" Object
		System.out.println(d.one+" "+d.two+" "+d.dc.x  +" "+d.dc.y );
	}
}
