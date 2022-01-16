package com.teachmeskills.additional;

import com.teachmeskills.additional.model.car.*;
import com.teachmeskills.additional.pattern.immutable_object.ImmutableEmployee;
import com.teachmeskills.additional.pattern.singleton.SingletonExample;

import java.time.LocalDate;

/**
 * - implement an example of a singleton pattern
 * - implement an example of the immutable object pattern
 * - implement an example of a strategy pattern
 */

public class Runner {
    public static void main(String[] args) {
        testSingletonExample();
        System.out.println();

        testImmutableObjectExample();
        System.out.println();

        testStrategyExample();
        System.out.println();
    }

    private static void testSingletonExample() {
        SingletonExample firstExample = SingletonExample.instance();
        System.out.println("First example value by default = " + firstExample.getCurrentValue());
        firstExample.increaseValue(1_500_000L);
        System.out.println("First example value after increasing = " + firstExample.getCurrentValue());
        SingletonExample secondExample = SingletonExample.instance();
        System.out.println("Second example value = " + secondExample.getCurrentValue());
        secondExample.decreaseValue(1_250_000L);
        System.out.println("First example value after decreasing second example = " + firstExample.getCurrentValue());
    }

    private static void testImmutableObjectExample() {
        LocalDate hireDateToObject = LocalDate.now().minusWeeks(12);
        StringBuilder nameToObject = new StringBuilder("Jane");
        ImmutableEmployee employee = new ImmutableEmployee(nameToObject, hireDateToObject);

        nameToObject.reverse().append("_____!!!!!!!");
        hireDateToObject = LocalDate.now();

        System.out.println(employee);
        System.out.println("Hire date from object: " + employee.getHireDate());
        System.out.println("Hire date from method: " + hireDateToObject);
        System.out.println("Employee name from object: " + employee.getName());
        System.out.println("Employee name from method: " + nameToObject);
    }

    private static void testStrategyExample() {
        Car dieselCar = new DieselCar();
        Car petrolCar = new PetrolCar();
        Car electricCar = new ElectricCar();
        Car gasCar = new GasCar();

        dieselCar.refill();
        petrolCar.refill();
        electricCar.refill();
        gasCar.refill();
    }
}