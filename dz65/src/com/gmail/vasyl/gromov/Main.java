package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter your string: ");
        a = sc.nextLine();

        int numberOfWords = numberOfWordsPerLine(a);
        System.out.println("Number of words in your line: "+numberOfWords);

    }

    static int numberOfWordsPerLine (String str){
        String[] words = str.split("[ ]");
        return words.length;
    }
}
