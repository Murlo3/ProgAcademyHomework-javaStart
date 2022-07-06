package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Your number: "+n);

        int result;

        for (int i = 1; i <= 10 ; i++) {
            result = i*n;
            System.out.println(i+" x "+n+" = "+result);
        }

    }
}