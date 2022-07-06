package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int a;
        int b;
        int c;
        int d;
        int a1;
        int b1;
        int c1;
        int d1;

        System.out.println("Input your number xxxx: ");
        number = sc.nextInt();
        System.out.println("Your number: "+number);

        a = number / 1000;
        b = number / 100 % 10;
        c = number / 10 % 10;
        d = number % 10;
        a1 = (a+b)/10;
        b1 = (a+b)%10;
        c1 = (c+d)/10;
        d1 = (c+d)%10;

        System.out.println("Your numbers: "+a+"  "+b+"  "+c+"  "+d);

        if ((a+b)==(c+d) || (a+b)==(c1+d1) || (a1+b1)==(c+d)) {
            System.out.println("Your number is lucky");
        } else {
            System.out.println("Your number is not lucky");
        }
    }
}
