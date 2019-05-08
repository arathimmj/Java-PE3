package com.stackroute.tdd;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FirstAndLastDayOfTheWeek {

//    get Monday
    public LocalDate getMonday(LocalDate today){

//        loop till we reach Monday
        while (today.getDayOfWeek() != DayOfWeek.MONDAY) {
            today = today.minusDays(1);
        }

        return today;
    }

//    get Sunday
    public LocalDate getSunday(LocalDate today){

//        loop till we reach Sunday
        while (today.getDayOfWeek() != DayOfWeek.SUNDAY) {
            today = today.plusDays(1);
        }

        return today;

    }

    public static void main(String[] args) {

        FirstAndLastDayOfTheWeek firstAndLastDayOfTheWeek = new FirstAndLastDayOfTheWeek();
        LocalDate today = LocalDate.now();      //get todays date

        LocalDate monday = firstAndLastDayOfTheWeek.getMonday(today);       //get Monday

        LocalDate sunday = firstAndLastDayOfTheWeek.getSunday(today);       //get SUnday

//        Print the results
        System.out.println("Today: " + today);
        System.out.println("Monday of the Week: " + monday);
        System.out.println("Sunday of the Week: " + sunday);
    }

}
