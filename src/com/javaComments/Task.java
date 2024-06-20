package com.javaComments;

import java.util.Scanner;

public class Task {//class starts

	public static void main(String[] args) {//main() method starts

		/*Write a java program area of Rectangle and Perimeter, comments entire program,
		 * get value from user
         *using java comments() */
		
		Scanner scanner = new Scanner(System.in);
		
		/*scanner is a class from java.util package,
		 * it is used to read the value form the user/keyboard
		 */
		
		System.out.println("Enter length ");//print statement
		int length = scanner.nextInt();//takes input from user
		
		System.out.println("Enter width ");//print statement
		int width = scanner.nextInt();//takes input from user
		
		int area = length*width ;//formula for area of rectangle 
		
		int perimeter  = 2*(length + width);//formula for perimeter of rectangle 
		
		System.out.println("Area = "+ area);//prints area
		
		System.out.println("perimeter = "+ perimeter);//prints perimeter
		
		scanner.close(); //close the read resource
				
					
		 
	}// main() method ends

}//class ends
