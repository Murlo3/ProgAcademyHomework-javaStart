package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int way = 217*2; // km
        double benzinPrice = 27.5; // uah/L
        double fuelConsumption = 9.8; // L/100km

        double sum; // uah

        double fuel = fuelConsumption * way / 100 ; // расход топлива
        sum = fuel * benzinPrice;

        System.out.println("Потрачено на поездку к теще = "+sum+"грн");
    }
}
