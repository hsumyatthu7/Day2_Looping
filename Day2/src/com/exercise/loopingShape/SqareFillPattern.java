package com.exercise.loopingShape;

public class SqareFillPattern {

	public static void main(String[] args) {
        int rows = 6; 
        int cols = 6; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	
}
