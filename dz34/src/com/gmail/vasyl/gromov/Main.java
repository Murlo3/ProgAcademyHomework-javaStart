package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("enter side a");
        a = sc.nextInt();
        System.out.println("enter side b");
        b = sc.nextInt();
        System.out.println("enter side c");
        c = sc.nextInt();

        System.out.println("side a= "+a+", "+"side b= "+b+", "+"side c= "+c);

        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("triangle exists");
        } else {
            System.out.println("triangle does not exist");
        }
    }
}
