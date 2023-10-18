package com.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
	
	 public static void shuffleArray(int[] array) {
		 
		 Random random = new Random();
		 for (int i = array.length - 1; i > 0; i--) {
			 int j = random.nextInt(i + 1);
			 int temp = array[i];
			 array[i] = array[j];
			 array[j] = temp;
		 }

	 }
	 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size : ");
		int n = scan.nextInt();
		int[] ar = new int[n];
		System.out.println("enter elements in an array : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		  shuffleArray(ar);
		  
		  System.out.println("shuffle array : ");
		  for(int i=0;i<ar.length;i++) {
	        	System.out.print( ar[i] + " ");
	        }	  
		 
	}
}
      
	    

	   
	
	

		
		
		
		
		
		
		
