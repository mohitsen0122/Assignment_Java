package com.practice.Multithreading;

public class FirstProgThread extends Thread
{
	public void run() // Internally we have run() to start the thread
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) 
	{
		FirstProgThread fpt = new FirstProgThread();
		fpt.start(); // We cannot use start() method more than one time in program
	}
}
