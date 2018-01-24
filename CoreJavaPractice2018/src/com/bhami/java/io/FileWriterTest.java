package com.bhami.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("C:\\BhamiData\\test1Out.txt");
			String s = "Bhami is writing charater data string to file";
			w.write(s);
			w.close();
			///reading character string using file reader
			Reader r = new FileReader("C:\\BhamiData\\test1Out.txt");
			int data = r.read();
			while(data != -1){
				System.out.print((char) data);  
                data = r.read();  
			}
			r.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
