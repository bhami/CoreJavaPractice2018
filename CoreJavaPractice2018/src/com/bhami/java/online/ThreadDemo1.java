package com.bhami.java.online;

public class ThreadDemo1 extends Thread {
	
	    public static void main(String [] args) 
	    {
	        ThreadDemo1 t = new ThreadDemo1();
	        t.start();
	        System.out.print("one. ");
	        t.start();
	        System.out.print("two. ");
	    }
	    public void run() 
	    {
	        System.out.print("Thread ");
	    }
}
