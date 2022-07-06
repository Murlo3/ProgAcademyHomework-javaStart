package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {

        System.out.print("2");
        for (int i = 2; i < 100; i++) {
            if (i > 8 && i % 2 !=0 && i % 3 !=0 && i % 5 !=0 && i % 7 !=0) {
                System.out.print(", "+i);
            }
            if (i < 8 && i % 2 !=0) {
                System.out.print(", "+i);
            }
        }
        System.out.println(".");
    }
}
