package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle (x): ");
        int x = sc.nextInt();
        System.out.println("Enter the height of the rectangle (y): ");
        int y = sc.nextInt();
        System.out.println(x+", "+y);

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {

                if (i == 1 || i == y || j == 1 || j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}