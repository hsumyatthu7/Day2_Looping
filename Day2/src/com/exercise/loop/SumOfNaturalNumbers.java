package com.exercise.loop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static int sumUsingForLoop(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static int sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid integer!");
                System.out.print("Enter a positive integer n: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);
        
        int sumForLoop = sumUsingForLoop(n);
        System.out.println("Sum using for loop: " + sumForLoop);
        
        int sumWhileLoop = sumUsingWhileLoop(n);
        System.out.println("Sum using while loop: " + sumWhileLoop);
        
        scanner.close();
    }
}
