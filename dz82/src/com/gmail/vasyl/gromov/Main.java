package com.gmail.vasyl.gromov;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][] arr1 = {{1,3,5,4}, {2,4,6,1}, {3,5,7,1}, {3,5,7,1}};
        saveArrayToFile(arr1);
    }

    public static void saveArrayToFile(int [][] arr){
        try (PrintWriter a = new PrintWriter("array.txt")) {
            for (int i = 0; i < arr.length; i++) {
                a.print(Arrays.toString(arr[i]));
                a.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }
}
