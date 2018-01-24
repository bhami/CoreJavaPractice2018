package com.bhami.java;

import java.util.Arrays;

public class ReverseStringTest {

	public static void main(String[] args) {
		System.out.println("Adding test1");
		String inStr = "How are you";
		
		
		String[] newStr = inStr.split("\\s");
		for(int i= newStr.length-1; i>=0; i--){
			System.out.print(newStr[i] + " ");
		}
		
		
		
		/*char[] strArr = inStr.toCharArray();
		int len = strArr.length;
		System.out.println("Input String: " + Arrays.toString(strArr));
		for(int i= len-1; i>=0; i-- ){
			System.out.print(strArr[i]);
		}*/
	}
}
