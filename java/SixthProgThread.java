package com.practice.Multithreading;

public class SixthProgThread extends Thread
{	
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			try
			{
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			// currentThread() return the currently executing thread,
			System.out.println(i+" "+Thread.currentThread());	
		}
		
	}
	public static void main(String[] args) 
	{
		SixthProgThread spt1 = new SixthProgThread();
		SixthProgThread spt2 = new SixthProgThread();
		SixthProgThread spt3 = new SixthProgThread();
		SixthProgThread spt4 = new SixthProgThread();
		spt1.start(); // Thread-0
		spt2.start();
		spt3.start();
		spt4.start(); // Thread-3
		
	}
	
}
