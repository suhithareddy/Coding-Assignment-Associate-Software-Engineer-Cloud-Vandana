package com.java;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Enter a Roman numeral: ");
	     String s = scan.next();
	     int result=0;
	     int value=0;
	     int value1 = 0;
	     for(int i= 0; i < s.length();i++)
	     {
	    	 char ch =s.charAt(i);
	    	
	    	 if( ch == 'I' || ch == 'i') {	 
	    		value = 1;
	    	 }
	    	 else if( ch== 'V' || ch == 'v') {
	    		 value= 5;
	    	 } 
	    	 else if( ch== 'X' || ch == 'x') {
	    		 value= 10;
	    	 }
	    	 else if( ch== 'L' || ch=='l') {
	    		 value= 50;
	    	 }
	    	 else if( ch== 'C' || ch=='c') {
	    		 value= 100;
	    	 }
	    	 else if( ch== 'D' || ch=='d') {
	    		 value= 500;
	    	 }
	    	 else if( ch== 'M' || ch=='m'){
	    		 value=1000;
	    	 }
	    	 
	    	 if (value1 < value) {
	    		 result -= value1;
	    	 }else {
	    		 result += value1;
	    	 }
	    	  value1 = value;
	     }
	     result += value1; 
	     System.out.println("Roman Integer Value : " + result);
	}
}
	     
	         
	   
   	
	    	 
