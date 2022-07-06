package com.gmail.vasyl.gromov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("array2D_1.txt");
        System.out.println(read2DArrayFromFile(file));

    }

    public static String readTextFromFile(File file){
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(file)) {
            for (;sc.hasNextLine();) {
                sb.append(sc.nextLine());
                sb.append(System.lineSeparator());
            }
        }catch (IOException e){
            System.out.println(e);
        }
        return sb.toString();
    }

    public static int[][] read2DArrayFromFile(File file){       // как считывать???
        int [][] array = new int[][]{};

        try (Scanner sc = new Scanner(file)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        return array;
    }
}
