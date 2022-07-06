package com.gmail.vasyl.gromov;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        textEditor();
    }

    public static void textEditor() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Input your text below");
        str = sc.nextLine();

        try (PrintWriter a = new PrintWriter("textEditor.txt")) {
            a.println(str);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }
}
