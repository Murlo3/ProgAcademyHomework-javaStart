package com.gmail.vasyl.gromov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array;
        System.out.println("Enter your string: ");
        array = sc.nextLine();
        System.out.println(array);

        char [] arrayChar = array.toCharArray();
        System.out.println(Arrays.toString(arrayChar));

        int sum = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == 'b') {
                sum = sum+1;
            }
        }
        System.out.println("Number of letters 'b': "+sum);
    }
}
