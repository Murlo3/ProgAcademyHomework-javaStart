//        Причем максимальная высота этой фигуры вводиться с клавиатуры (в примере максимальная высота - 4).
//        С помощью цикла (только одного) нарисовать такую фигуру.
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of your figure (x): ");
        int x = sc.nextInt();
        System.out.println("Height of your figure: "+x);

        for (int i = 1; i <= x*x; i++) {
            int n = 0;
            if (i<n){
                System.out.print("*");
                System.out.println();
                n = n+1;
            } else if (i>n){

            } else {
                System.out.print("*");
            }
        }
    }
}
