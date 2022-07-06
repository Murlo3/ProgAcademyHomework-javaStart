package com.gmail.vasyl.gromov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the size of the array");
        a = sc.nextInt();
        System.out.println("The size of your array: "+a);

        int [] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an element of your array");
            array [i] = sc.nextInt();
        }
        System.out.println("Your array = " + Arrays.toString(array));

    }
}
