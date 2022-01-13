package com.teachmeskills.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Get date of next Tuesday.
 */

public class Task2 {
    public static void main(String[] args) {
        LocalDate nextTuesday = getNextTuesday();
        System.out.println("Next tuesday: " + nextTuesday);
    }

    private static LocalDate getNextTuesday() {
        LocalDate date = LocalDate.now().plusDays(1);
        while(!isTuesday(date)){
            date = date.plusDays(1);
        }
        return date;
    }

    private static boolean isTuesday(LocalDate date){
        return date.getDayOfWeek().equals(DayOfWeek.TUESDAY);
    }
}