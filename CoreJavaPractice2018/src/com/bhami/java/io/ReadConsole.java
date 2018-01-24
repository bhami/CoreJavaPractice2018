package com.bhami.java.io;

import java.io.IOException;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		System.out.println("ENter the input");
		int i =  System.in.read(); // returns Ascii code of 1st character
		System.out.println("character represntation:" + (char)i + "byte represntation:" + i);
	}

}
