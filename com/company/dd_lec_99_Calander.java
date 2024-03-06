package com.company;

import java.util.Calendar;

public class dd_lec_99_Calander {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
    }
}
