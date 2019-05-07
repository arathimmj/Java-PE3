package com.stackroute.tdd;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FirstAndLastDayOfTheWeek {

    public LocalDate getMonday(LocalDate today){

        while (today.getDayOfWeek() != DayOfWeek.MONDAY) {
            today = today.minusDays(1);
        }

        return today;
    }

    public LocalDate getSunday(LocalDate today){

        while (today.getDayOfWeek() != DayOfWeek.SUNDAY) {
            today = today.plusDays(1);
        }

        return today;

    }

    public static void main(String[] args) {

        FirstAndLastDayOfTheWeek firstAndLastDayOfTheWeek = new FirstAndLastDayOfTheWeek();
        LocalDate today = LocalDate.now();

        LocalDate monday = firstAndLastDayOfTheWeek.getMonday(today);

        LocalDate sunday = firstAndLastDayOfTheWeek.getSunday(today);

        System.out.println("Today: " + today);
        System.out.println("Monday of the Week: " + monday);
        System.out.println("Sunday of the Week: " + sunday);
    }

}
