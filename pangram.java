package com.java;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int[] temp = new int[26];
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(( ch >='a' && ch <='z') || ( ch >='A' && ch <= 'Z')){
				
				int index =ch - 'a';
				temp[index]++;	
			}
		}
		
	    for (int i = 0; i < temp.length; i++) {
	        if (temp[i] == 0) {
	            System.out.println("not pangram");
	            return;
	        }
	     
	    }
	  
	    System.out.println("pangram");
	}
	  
}


