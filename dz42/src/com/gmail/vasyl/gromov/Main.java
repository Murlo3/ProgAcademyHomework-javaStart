package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Your number: "+n);

        int factorial = 1;

        if (n >= 4 && n<=16) {
            for (int i = 1; i <= n; i++) {

                factorial = factorial*i;

            }
        } else {
            System.out.println("Enter the number 4<=Your number<=16");
        }
        System.out.println("factorial "+n+" = "+factorial);
    }
}