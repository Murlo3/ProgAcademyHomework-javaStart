//        Выведите на экран «песочные часы» максимальная ширина которых
//        считывается с клавиатуры (число нечетное). В примере ширина равна 5.
//        *****
//         ***
//          *
//         ***
//        *****

package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the height of your figure: ");
        x = sc.nextInt();
        System.out.println("Height of your figure: "+x);

        if (x % 2 != 0) {                                           //Проверка на непарность
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if ((i>=j && i>=x-j+1) || (i<=j && i<=x-j+1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Error. Enter an unpaired number");
        }
    }
}
