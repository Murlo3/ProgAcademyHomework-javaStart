package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNumber("PI", Math.PI, 2));
        System.out.println(getNumber("PI", Math.PI, 3));
        System.out.println(getNumber("PI", Math.PI, 4));
        System.out.println(getNumber("PI", Math.PI, 5));
        System.out.println(getNumber("PI", Math.PI, 6));
        System.out.println(getNumber("PI", Math.PI, 7));
        System.out.println(getNumber("PI", Math.PI, 8));
        System.out.println(getNumber("PI", Math.PI, 9));
        System.out.println(getNumber("PI", Math.PI, 10));
        System.out.println(getNumber("PI", Math.PI, 11));
    }

    public static String getNumber (String str, double num, int n){
        String text = String.format(str+" = %."+n+"f",num);
        return text;
    }
}
