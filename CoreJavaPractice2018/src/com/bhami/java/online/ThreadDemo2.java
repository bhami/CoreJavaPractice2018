package com.bhami.java.online;

class MyThreadx extends Thread
{
	MyThreadx() 
	{
		System.out.print(" MyThreadx");
	}
	public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
public class ThreadDemo2 
{
	public static void main (String [] args) 
	{
		//Thread t = new MyThreadx();
		//t.start();
		
		Thread t = new MyThreadx() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}