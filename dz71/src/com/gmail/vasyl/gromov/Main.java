package com.gmail.vasyl.gromov;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println(date1+"   "+date2);

        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, 2022);
        cl.set(Calendar.MONTH, Calendar.JUNE);
        cl.set(Calendar.DAY_OF_MONTH, 5);
        date1 = cl.getTime();

        cl.set(Calendar.YEAR, 2022);
        cl.set(Calendar.MONTH, Calendar.MAY);
        cl.set(Calendar.DAY_OF_MONTH, 5);
        date2 = cl.getTime();

        System.out.println(date1+"   "+date2);

        long a = date1.getTime();
        long b = date2.getTime();
        System.out.println(a+"   "+b);

        System.out.println(a-b);

    }
}
