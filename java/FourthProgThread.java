package com.practice.Multithreading;

public class FourthProgThread extends Thread
{
	public void run()
	{
		for(int i = 1; i < 100; i++)
		{
			try
			{
				Thread.sleep(100);
			} catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		FourthProgThread fpt1 = new FourthProgThread();
		FourthProgThread fpt2 = new FourthProgThread();
		fpt1.start();
		fpt2.start();
	}
}
