package com.gmail.vasyl.gromov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number ofe rows/columns:");
        a = sc.nextInt();

        int [] [] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array [i][j] = j+1;
            }
        }

        for (int[] element:array){
            System.out.println(Arrays.toString(element));
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sum = sum + array [i][j];
                }
            }
        }
        System.out.println("Sum= "+sum);

    }
}
