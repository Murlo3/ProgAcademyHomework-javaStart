package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBits(7));
    }

    public static int getBits (int a){
        int count = 0;
        for (;a!=0;) {
            if((a & 1) > 0){
                count +=1;
            }
            a = a>>1;
        }
        return count;
    }
}
