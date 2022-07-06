package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,6,5,7,8,9,11,23,54,5,76,87,4,5,3,2};
        int b = getIndexInArray(5,arr);
        System.out.println(b);
    }

    static int getIndexInArray (int element,int[] a) {

        int index = -1;

        for (int i = a.length-1; i >=0; i--) {
            if (a[i] == element){
                index = i;
            }
        }
        return index;
    }
}
