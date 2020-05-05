package com.practice.java;

class Test1<A>
{
	A obj;
	Test1(A obj)
	{
		this.obj = obj;
	}
	public A getObject()
	{
		return this.obj;
	}
}
class Test2<A, B>
{
	A obja;
	B objb;
	Test2(A obj1, B obj2)
	{
		this.obja = obj1;
		this.objb = obj2;
	}
	public void display()
	{
		System.out.println(this.obja);
		System.out.println(this.objb);
	}
}
class Test3
{
	
}
public class GenericOne 
{
	public static void main(String[] args) 
	{
		Test1<Integer> test_int = new Test1<>(10);
		System.out.println(test_int.getObject());
		
		Test1<String> test_string = new Test1<>("Jspider & Qspider");
		System.out.println(test_string.getObject());
		
		Test2<Integer, String> test_int_string1 = new Test2<>(100,"JSPIDER");
		test_int_string1.display();
		
		
		Test2<String, String> test_int_string2 = new Test2<>("BTM 1","BTM 2");
		test_int_string2.display();
		
		
		
	}
}
