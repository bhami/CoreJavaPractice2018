package com.bhami.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\BhamiData\\test1Out.txt");
		fout.write(75);
		//writing string 
		String  s = "Bhami is testing Output operation";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		FileInputStream fin = new FileInputStream("C:\\BhamiData\\test1Out.txt");
		int i = 0;
		System.out.println("Input  file Contains:");
		while((i= fin.read()) != -1 ){
			System.out.println( (char)i);
		}
		
		fin.close();
	}

}
