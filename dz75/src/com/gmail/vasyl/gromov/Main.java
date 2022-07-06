//    Ввести с консоли дату. Сравнить ее с текущей датой в системе.
//    Вывести отличающиеся части (год, месяц) на экран.

package com.gmail.vasyl.gromov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String dateInput = "";
        System.out.println("Введите дату dd.MM.yyyy: ");
        dateInput = sc.nextLine();
        try {
            date = sdf.parse(dateInput);
        } catch (ParseException e) {
            System.out.println(e);
        }

        Date dateToDay = new Date();
        String dateToDay = "";
        dateToDay = sdf.format(dateToDay);


        System.out.println(dateToDay);
        System.out.println(dateInput);

        Calendar cl = Calendar.getInstance();
    }
}
