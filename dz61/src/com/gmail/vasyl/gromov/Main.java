package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {

        int a = getMaxNumber(-4,-5,-6,-7,-8,-12,-23,-546,-234,-67);
        System.out.println(a);
    }

    static int getMaxNumber(int... array){
        int maxNumber = array[0];
        for (int element:array) {
            if (element>maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }
}
