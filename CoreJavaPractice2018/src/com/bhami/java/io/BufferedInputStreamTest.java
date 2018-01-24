package com.bhami.java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		try{
			FileInputStream fin = new FileInputStream("C:\\BhamiData\\test1Out.txt");
			BufferedInputStream  bin = new BufferedInputStream(fin);
			String s = "Bhami learning good at file I/O";
			int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();  
		}catch(Exception e){System.out.println(e);}    
	}
}
