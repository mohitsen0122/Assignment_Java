package com.practice.Multithreading;

public class ThirdProgThread extends Thread 
{
	public void run()
	{
		for(int i = 0; i < 6; i++)
		{
			try 
			{
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
				System.out.println(i);
			
		}
	}
	public static void main(String[] args) 
	{
		ThirdProgThread tpt1 = new ThirdProgThread();
		ThirdProgThread tpt2 = new ThirdProgThread();
		tpt1.run();
		tpt2.run();
	}
}
