package com.gmail.vasyl.gromov;

public class Main {

    public static void main(String[] args) {
        findPalindrom();
    }

    static void findPalindrom (){
        int maxPalindrom = 0;
        int iMax = 0;
        int jMax = 0;

        for (int i = 1; i <= 999; i++) {
            for (int j = 1; j <= 999; j++) {

                int checkPalindrom = i*j; //abcdef

                int a = checkPalindrom/100000;
                int b = checkPalindrom/10000%10;
                int c = checkPalindrom/1000%10;
                int d = checkPalindrom/100%10;
                int e = checkPalindrom/10%10;
                int f = checkPalindrom%10;

                if (a==f && b==e && c==d) {
                    if (checkPalindrom > maxPalindrom){
                        maxPalindrom = checkPalindrom;
                        iMax = i;
                        jMax = j;
                    }
                }
            }
        }
        System.out.println(iMax+" x "+jMax+" = "+maxPalindrom);
    }
}
