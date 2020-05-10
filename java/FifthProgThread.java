package com.practice.Multithreading;

public class FifthProgThread extends Thread 
{
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			try
			{
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		FifthProgThread fpt1 = new FifthProgThread();
		FifthProgThread fpt2 = new FifthProgThread();
		fpt1.start();
		fpt2.start();
	}
}
