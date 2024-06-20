package com.javaComments;

import java.util.Scanner;

public class Task2 {// class starts
	
public static void main(String[] args) {// method start
		
		/*
		 * Write a java program to find the given number is even or odd, 
		 *  comments entire program, using java comments
		 */
		        Scanner scanner = new Scanner(System.in);
		        
		        /*scanner is a class from java.util package,
				 * it is used to read the value form the user/keyboard
				 */

		      System.out.print("Enter a number: ");
		      
		        int number = scanner.nextInt();//reads int value
		        
		        scanner.close();

		        /*a % b
		         * a is the dividend.b is the divisor.
		         * The result is the remainder after dividing a by b.
		         * % returns the remainder of the division of two numbers. 
		         */
		        
		        if (number % 2 == 0)// Check if the number is even or odd
		        	{
		            System.out.println(number + " is even.");// prints statement
		             }
		        else
		           {
		            System.out.println(number + " is odd.");// prints statement
		            }
		        
		       
		    
	}// method ends

}// class ends
