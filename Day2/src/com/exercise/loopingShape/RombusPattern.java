package com.exercise.loopingShape;

public class RombusPattern {
	
	public static void main(String[] args) {
        int rows = 4;
        int spaces = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }

            System.out.println();

            spaces++;
        }
    }

}
