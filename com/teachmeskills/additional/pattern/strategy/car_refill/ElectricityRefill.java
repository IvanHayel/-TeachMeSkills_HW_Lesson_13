package com.teachmeskills.additional.pattern.strategy.car_refill;

public class ElectricityRefill implements CarRefillStrategy {
    @Override
    public void refill() {
        System.out.println("The car is charged with electricity.");
    }
}