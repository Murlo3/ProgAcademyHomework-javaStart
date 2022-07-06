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
        int e;
        int f;

        System.out.println("Input your number xxxxxx: ");
        number = sc.nextInt();
        System.out.println("Your number: "+number);

        a = number / 100000;
        b = number / 10000 % 10;
        c = number / 1000 % 10;
        d = number / 100 % 10;
        e = number / 10 % 10;
        f = number % 10;

        System.out.println("Your numbers: "+a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f);

        if (a==f && b==e && c==d) {
            System.out.println("Your number is palindrome");
        } else {
            System.out.println("Your number is not palindrome");
        }
    }
}