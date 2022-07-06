package com.gmail.vasyl.gromov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] a = new int[15];
	int [] b = new int[15*2];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*10);
        }
        System.arraycopy(a,0,b,0,a.length);
        System.arraycopy(a,0,b,15,a.length);
        for (int i = 15; i < b.length; i++) {
            b[i] = b[i] * 2;
        }

        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+ Arrays.toString(b));
    }
}
