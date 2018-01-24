package com.bhami.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsoleTest {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);  
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your Name");
		String name = br.readLine();
		System.out.println("Welcome:" + name);
		
	}

}
