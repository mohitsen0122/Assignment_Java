package com.practice.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
	int count;
	int countSync;
	AtomicInteger countAt = new AtomicInteger();  
	public void increment()
	{
		count++;
	}
	
	// Synchronized method when one thread is performing operation by the time have to wait to other thread
	public synchronized void incrementSync()
	{
		countSync++;
	}
	
	// Synchronized increment operation using atomicInteger // primitive integer // concurrent 
	public void incSync()
	{
		countAt.incrementAndGet();
	}
}
public class CombinedThreadProg 
{
	public static void main(String[] args) throws InterruptedException  
	{
		Counter c = new Counter();
		Runnable obj1 = new Runnable() {
			public void run()
			{
				for(int i = 0; i < 1000; i++)
				{
					c.increment();
				}
			}
		};
		
		Thread t1 = new Thread(obj1, "Asynchronized Thread count");
		
		Runnable obj2 = new Runnable() {
			public void run()
			{
				for(int i = 0; i < 1000; i++)
				{
					c.increment();
				}
				
			}
		};
		Thread t2 = new Thread(obj2);
		
		// I am passing obj3 into Thread constructor at the time of calling new Thread(obj3) 
		// I can directly give without passing obj3 i can write the same code inside constructor
		
		
		Thread t3 = new Thread(new Runnable() {
				public void run()
				{
					for(int i = 0; i < 1000; i++)
					{
						c.incrementSync();
					}
				}
			}
		, "Synchronized Method Thread countSync");
		
		
		// Or else we can lambda expression just because of Runnable interface is functional interface
		
		
		Thread t4 = new Thread( new Runnable()  
		{
			public void run()
			{
				for(int i = 0; i < 1000; i++)
				{
					c.incrementSync();
				}
			}
		}
		);
		
		Thread t5 = new Thread(new Runnable()
		{
			public void run()
			{
				
				for(int i = 0 ; i < 1000; i++)
				{
					c.incSync();
				}
			}
		}
		, "Synchrinuzed count by AtomicInteger ");
		
		Thread t6 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i = 0 ; i < 1000; i++)
				{
					c.incSync();
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
		// Join is used to combine all the thread including main thread because all the threads performing operation one by one but
		// main thread is free by the time it prints the all value which is written in  System.out.println();
		// main thread will wait till all the joins to be combined
		// then main thread print the value.
		// main waits thread to die
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		
		System.out.println(t1.getName());
		System.out.println(c.count);
		System.out.println(t3.getName());
		System.out.println(c.countSync);
		System.out.println(t5.getName());
		System.out.println(c.countAt);
	}
}
