package com.teachmeskills.task_3;

import com.teachmeskills.task_3.model.test.FunctionalInterfaceExampleTest;

/**
 * Create a generic functional interface.
 * Write a class with one method (think and reason the decision about whether it will be a static method or not).
 * In this method, implement the logic:
 * - if the number 1 is entered into the console, then: use the interface with a string type
 * and pass the logic of string reversal (outputting the string in reverse order) to the interface method.
 *
 * - if the number 2 is entered into the console, then: use an interface with an integer type and
 * pass the logic of finding the factorial of a number to the interface method.
 */

public class Runner {
    public static void main(String[] args) {
        FunctionalInterfaceExampleTest.test();
    }
}