package com.gmail.vasyl.gromov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [][] a = new int[6][6];

        for (int i = 0; i < a.length; i++) {                            //Заполнили массив
            for (int j = 0; j < a.length; j++) {
                a[i][j] = j+1;
            }
        }
        for (int [] element:a) {                                        //Вывели на экран массив
            System.out.println(Arrays.toString(element));
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {                            //Перевернули на 90°
            for (int j = 0; j < a.length; j++) {
                if (i>j) {
                    a[i][j] = a[j][i];
                } else if (i<j) {
                    a[i][j] = a[j][i];
                } else {
                    a[i][j] = a[j][i];
                }
            }
        }
        for (int [] element:a) {                                        //Вывели на экран массив
            System.out.println(Arrays.toString(element));
        }

    }
}
