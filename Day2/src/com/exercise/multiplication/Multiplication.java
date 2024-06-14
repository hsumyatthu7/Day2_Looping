package com.exercise.multiplication;

import java.util.Scanner;

public class Multiplication {
	
	 public static void printMultiplicationTable(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                System.out.printf("%d * %d = %d\n", j, i, i * j);
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        printMultiplicationTable(n);
	        
	        scanner.close();
	    }

}
