package com.gmail.vasyl.gromov;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
//	int [] a = {7,2,9,4,5};
//    int [] b = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[a.length-i-1];
//        }
//        System.out.println(Arrays.toString(b));
//    }
//}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter length of array.");
        x = sc.nextInt();
        int[] array1 = new int[x * 2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);


        }
        System.out.println("Was an array    " + Arrays.toString(Arrays.copyOfRange(array1, array1.length / 2, array1.length)));

        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[array1.length - 1 - i];

        }


        System.out.println("Became an array " + Arrays.toString(Arrays.copyOf(array1, array1.length / 2)));

    }

}