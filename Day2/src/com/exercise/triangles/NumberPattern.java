package com.exercise.triangles;

import java.util.Scanner;

public class NumberPattern {

	 public static void main(String[] args) {
	        
	        int n; 
			Scanner scanner = new Scanner(System.in);
			do {
	            System.out.print("Enter Rows : ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("That's not a valid row!");
	                System.out.println("Enter a positive integer n: ");
	                scanner.next();
	            }
	            n = scanner.nextInt();
	        } while (n <= 0);
			
			scanner.close();
	        for (int i = 1; i <= n; i++) { 
	            for (int j = 1; j <= i; j++) { 
	                System.out.print(i); 
	            }
	            System.out.println(); 
	        }
	    }
}
