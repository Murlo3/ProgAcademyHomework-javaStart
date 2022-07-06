package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello my name Vasyl";
        char mySymbol = 'w';
        System.out.println(calculateSymbolsInString(myString, mySymbol));
    }

    static int calculateSymbolsInString(String str, char a){
        int number = 0;

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                number+=1;
            }
        }
        return number;
    }
}
