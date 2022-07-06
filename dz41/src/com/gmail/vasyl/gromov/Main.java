package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lanes: ");
        int n = sc.nextInt();
        System.out.println("Your number of lanes: "+n);

        while (n>0){
            System.out.println("***+++***+++***+++***");
            n=n-1;
        }
    }
}
