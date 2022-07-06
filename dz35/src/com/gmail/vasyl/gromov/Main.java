package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        int r = 4;

        System.out.println("Input x");      // вводить с "," . ввод с точной "."
        x = sc.nextDouble();
        System.out.println("Input y");      // вводить с "," . ввод с точной "."
        y = sc.nextDouble();
        System.out.println("Your coordinates: "+x+", "+y);

        if (x*x + y*y <= r*r) {
            System.out.println("Point inside a circle");
        } else {
            System.out.println("The point is not inside the circle");
        }
    }
}
