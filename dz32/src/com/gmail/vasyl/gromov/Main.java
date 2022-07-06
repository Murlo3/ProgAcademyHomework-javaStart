package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int floorNumber;
        int entranceNumber;
        int apartmentNumber;
        System.out.println("Input apartmentNumber");
        apartmentNumber = sc.nextInt();
        System.out.println("apartmentNumber= " + apartmentNumber);

        entranceNumber = 0;
        if (apartmentNumber >=1 && apartmentNumber <= 36) {
            entranceNumber = 1;
        } else if (apartmentNumber > 36 && apartmentNumber <= 72) {
            entranceNumber = 2;
        } else if (apartmentNumber > 72 && apartmentNumber <= 108) {
            entranceNumber = 3;
        } else if (apartmentNumber > 108 && apartmentNumber <= 144) {
            entranceNumber = 4;
        } else
            System.out.println("apartment does not exist");

//        switch (apartmentNumber) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 37:
//            case 38:
//            case 39:
//            case 40:
//                case
//                floorNumber = 1;
//                break;
//        }


        if (apartmentNumber >=1 && apartmentNumber <=4 ||
            apartmentNumber >=37 && apartmentNumber <=40 ||
            apartmentNumber >=73 && apartmentNumber <=76 ||
            apartmentNumber >=109 && apartmentNumber<=112){
                floorNumber = 1;
        } else if (apartmentNumber >=5 && apartmentNumber <=8 ||
                    apartmentNumber >=41 && apartmentNumber <=44 ||
                    apartmentNumber >=77 && apartmentNumber <=80 ||
                    apartmentNumber >=113 && apartmentNumber<=116){
                floorNumber = 2;
        } else if (apartmentNumber >=9 && apartmentNumber <=12 ||
                    apartmentNumber >=45 && apartmentNumber <=48 ||
                    apartmentNumber >=81 && apartmentNumber <=84 ||
                    apartmentNumber >=117 && apartmentNumber<=120){
                floorNumber = 3;
        } else if (apartmentNumber >=13 && apartmentNumber <=16 ||
                    apartmentNumber >=49 && apartmentNumber <=52 ||
                    apartmentNumber >=85 && apartmentNumber <=88 ||
                    apartmentNumber >=121 && apartmentNumber<=124){
                floorNumber = 4;
        } else if (apartmentNumber >=17 && apartmentNumber <=20 ||
                    apartmentNumber >=53 && apartmentNumber <=56 ||
                    apartmentNumber >=89 && apartmentNumber <=92 ||
                    apartmentNumber >=125 && apartmentNumber<=128){
                floorNumber = 5;
        } else if (apartmentNumber >=21 && apartmentNumber <=24 ||
                    apartmentNumber >=57 && apartmentNumber <=60 ||
                    apartmentNumber >=93 && apartmentNumber <=96 ||
                    apartmentNumber >=129 && apartmentNumber<=132){
                floorNumber = 6;
        } else if (apartmentNumber >=25 && apartmentNumber <=28 ||
                    apartmentNumber >=61 && apartmentNumber <=64 ||
                    apartmentNumber >=97 && apartmentNumber <=100 ||
                    apartmentNumber >=133 && apartmentNumber<=136){
                floorNumber = 7;
        } else if (apartmentNumber >=29 && apartmentNumber <=32 ||
                    apartmentNumber >=65 && apartmentNumber <=68 ||
                    apartmentNumber >=101 && apartmentNumber <=104 ||
                    apartmentNumber >=137 && apartmentNumber<=140){
                floorNumber = 8;
        } else if (apartmentNumber >=33 && apartmentNumber <=36 ||
                    apartmentNumber >=69 && apartmentNumber <=72 ||
                    apartmentNumber >=105 && apartmentNumber <=108 ||
                    apartmentNumber >=141 && apartmentNumber<=144){
                floorNumber = 9;
        } else {
            floorNumber = 0;
        }

        System.out.println("entranceNumber= "+entranceNumber+", "+"floorNumber= "+floorNumber);

    }
}
