package com.teachmeskills.task_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Get the day of the week from a date.
 */

public class Task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(today + " " + dayOfWeek);
    }
}