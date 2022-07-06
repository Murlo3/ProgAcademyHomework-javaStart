package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle (x): ");
        int x = sc.nextInt();
        System.out.println("Enter the height of the rectangle (y): ");
        int y = sc.nextInt();

        getRectangle(x,y);

    }

    static void getRectangle (int a, int b) {

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {

                if (i == 1 || i == b || j == 1 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
