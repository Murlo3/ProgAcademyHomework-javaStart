package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
        String str = getСoncatenation(-40,2.2,"Zarplata ");
        System.out.println(str);
    }

    static String getСoncatenation(int a, double b, String c){
        String sum = c + (b+(double)a);
        return sum;
    }
}
