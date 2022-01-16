package com.teachmeskills.additional.pattern.strategy.car_refill;

public class DieselRefill implements CarRefillStrategy {
    @Override
    public void refill() {
        System.out.println("The car was filled with diesel.");
    }
}