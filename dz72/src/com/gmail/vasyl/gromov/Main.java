package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,4,2};
        System.out.println(myArrayToString(arr));
    }
    public static String myArrayToString (int [] a){
        StringBuilder sb = new StringBuilder("[");
        for (int element:a) {
            sb.append(element+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
