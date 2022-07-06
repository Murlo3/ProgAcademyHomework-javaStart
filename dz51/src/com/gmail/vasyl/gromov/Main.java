package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
	int [] a = {0, 5, 2, 4, 7, 1, 3, 19};
	int sum = 0;

        for (int i = 0; i <= 7; i++) {
            if (a[i] % 2 != 0) {
            sum = sum + a[i];
            }

        }
        System.out.println("sum: "+sum);
    }
}
