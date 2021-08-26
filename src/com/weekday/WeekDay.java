package com.weekday;
import java.util.Calendar;

public class WeekDay {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Day: " + (calendar.get(Calendar.DATE)));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + (calendar.get(Calendar.YEAR)));
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("Current day = " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
