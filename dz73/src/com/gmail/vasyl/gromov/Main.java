package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your binary number: ");
        str = sc.nextLine();

        int[] strIntArray = new int[str.length()];

        for (int i = 0; i < strIntArray.length; i++) {
            strIntArray[i] = str.charAt(i) - '0';
        }

        double sum=0;
        for (int i = 0; i < strIntArray.length; i++) {
            sum = sum + strIntArray[i] * Math.pow(2,(strIntArray.length-1-i));
        }

        System.out.println("Your binary number in decimal: "+sum);
    }
}
