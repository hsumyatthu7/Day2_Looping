package com.exercise.loopingShape;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
        int n = 4; 

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
