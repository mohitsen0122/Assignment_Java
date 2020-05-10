package com.practice.Multithreading;

public class SecondProgThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) 
	{
		SecondProgThread spt = new SecondProgThread();
		Thread t = new Thread(spt);
		t.start();
	}
}
