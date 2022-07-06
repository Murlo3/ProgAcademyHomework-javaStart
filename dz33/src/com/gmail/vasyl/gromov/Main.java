package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int daysQuantity;
        int year;

        System.out.println("Input your year");
        year = sc.nextInt();
        System.out.println("Your year= "+year);

        //if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        if (year%4==0 && (year%100!=0 ^ year%400==0)) {
            daysQuantity = 366;
            System.out.println("Number of days: "+daysQuantity);
        } else {
            daysQuantity = 365;
            System.out.println("Number of days: "+daysQuantity);
        }

    }
}
