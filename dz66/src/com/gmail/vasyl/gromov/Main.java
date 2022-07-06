package com.gmail.vasyl.gromov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Your array:  "+Arrays.toString(readArrayIntFromKeyboard()));
        int a = checkIntArrayForProgression(readArrayIntFromKeyboard());
        System.out.println(a);
    }

    static int[] readArrayIntFromKeyboard (){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        //System.out.println("Array elements are: "+ Arrays.toString(array));
        return array;
    }

    static int checkIntArrayForProgression (int[] arr){
        for (int i = 1; i < arr.length; i++) {                          //Проверка на арифм. прогрессию (коэф.1)
            if (arr[i]-arr[i-1]==arr[1]-arr[0]){
            } else return 0;
            if (i==arr.length-1){
                return 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {                          //Проверка на геом. прогрессию (коэф.2)
            if (arr[i]/arr[i-1]==arr[1]/arr[0]){
            } else return 0;
            if (i==arr.length-1){
                return 2;
            }
        }
//        for (int i = 1; i < arr.length; i++) {                          //Проверка на кв. прогрессию (коэф.3)
//            if(arr[1]){
//
//            }
//        }
//        for (int i = 1; i < arr.length; i++) {                          //Проверка на куб. прогрессию (коэф.4)
//
//        }
        return -1;
    }

//    static int getNextNumberInProgression (int a){
//
//        int[] a = str.
//        return nextNumber;
//    }
}
