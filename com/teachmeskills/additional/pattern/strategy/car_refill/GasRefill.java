package com.teachmeskills.additional.pattern.strategy.car_refill;

public class GasRefill implements CarRefillStrategy {
    @Override
    public void refill() {
        System.out.println("The car filled up with gas.");
    }
}