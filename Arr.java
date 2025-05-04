package com.System;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        // Input elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter value for class " + i + " student " + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Output elements
        System.out.println("Entered values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Class " + i + " Student " + j + ": " + arr[i][j]);
            }
        }

        scanner.close();
    }
}
