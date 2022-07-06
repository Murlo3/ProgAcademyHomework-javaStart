//        Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
//        вводит с клавиатуры координаты точки x и y. Написать программу которая
//        определит лежит ли эта точка внутри треугольника или нет.

package com.gmail.vasyl.gromov;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xA = 0;
        int yA = 0;
        int xB = 4;
        int yB = 4;
        int xC = 6;
        int yC = 1;
        double x;
        double y;
        double s;   //Площадь данного треугольника
        double sABx;  //Площадь внутр. треугольника
        double sBCx;  //Площадь внутр. треугольника
        double sACx;  //Площадь внутр. треугольника
        double p;   //полупериметр

        //Если точка лежит внутри треугольника, то сумма площадей образованных ей треугольников равна площади данного треугольника.

        System.out.println("Input x");
        x = sc.nextDouble();
        System.out.println("Input y");
        y = sc.nextDouble();
        System.out.println("Your coordinates: "+x+", "+y);

        double lengthAB = Math.sqrt((xA-xB)*(xA-xB)+(yA-yB)*(yA-yB));   //длина стороны данного треугольника
        double lengthBC = Math.sqrt((xB-xC)*(xB-xC)+(yB-yC)*(yB-yC));   //длина стороны данного треугольника
        double lengthAC = Math.sqrt((xA-xC)*(xA-xC)+(yA-yC)*(yA-yC));   //длина стороны данного треугольника
        p = (lengthAB+lengthBC+lengthAC)*0.5;
        s = Math.sqrt(p*(p-lengthAB)*(p-lengthBC)*(p-lengthAC));        //Площадь данного треугольника

        double lengthAx = Math.sqrt((xA-x)*(xA-x)+(yA-y)*(yA-y));       //образовавшаяся сторона
        double lengthBx = Math.sqrt((xB-x)*(xB-x)+(yB-y)*(yB-y));       //образовавшаяся сторона
        double lengthCx = Math.sqrt((xC-x)*(xC-x)+(yC-y)*(yC-y));       //образовавшаяся сторона

        double pABx = (lengthAB+lengthAx+lengthBx)*0.5;                 //полупериметр образовавшегося треугольника
        double pBCx = (lengthBC+lengthBx+lengthCx)*0.5;                 //полупериметр образовавшегося треугольника
        double pACx = (lengthAC+lengthAx+lengthCx)*0.5;                 //полупериметр образовавшегося треугольника

        sABx = Math.sqrt(pABx*(pABx-lengthAB)*(pABx-lengthAx)*(pABx-lengthBx));     //Площадь образовавшегося треугольника
        sBCx = Math.sqrt(pBCx*(pBCx-lengthBC)*(pBCx-lengthBx)*(pBCx-lengthCx));     //Площадь образовавшегося треугольника
        sACx = Math.sqrt(pACx*(pACx-lengthAC)*(pACx-lengthAx)*(pACx-lengthCx));     //Площадь образовавшегося треугольника

        //Округление
        BigDecimal sABx1 = new BigDecimal(Double.toString(sABx));
        BigDecimal sBCx1 = new BigDecimal(Double.toString(sBCx));
        BigDecimal sACx1 = new BigDecimal(Double.toString(sACx));
        sABx1 = sABx1.setScale(3, RoundingMode.HALF_UP);
        sBCx1 = sBCx1.setScale(3, RoundingMode.HALF_UP);
        sACx1 = sACx1.setScale(3, RoundingMode.HALF_UP);
        double sABx2 = sABx1.doubleValue();                                 //вернули значение площади созданных треугольников в double
        double sBCx2 = sBCx1.doubleValue();                                 //вернули значение площади созданных треугольников в double
        double sACx2 = sACx1.doubleValue();                                 //вернули значение площади созданных треугольников в double


        System.out.println("Площадь данного треугольника: "+s);
        System.out.println("Площади образовавшихся треугольников: "+sABx2+", "+sBCx2+", "+sACx2);


        if (s == (sABx2+sBCx2+sACx2)) {
            System.out.println("Point inside triangle");
        } else {
            System.out.println("Point not inside triangle");
        }

    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_DOWN);
        return bd.doubleValue();
    }
}