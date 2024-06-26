package com.exercise.triangles;

import java.util.Scanner;

public class Pyramid {

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
		for (int i = 1; i <= n; i++) { 
			
			for (int j = n; j > i; j--) {
				System.out.print("  "); 
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
			scanner.close();
		}
	}
}
