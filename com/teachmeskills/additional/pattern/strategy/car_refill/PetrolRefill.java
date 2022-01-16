package com.teachmeskills.additional.pattern.strategy.car_refill;

public class PetrolRefill implements CarRefillStrategy {
    @Override
    public void refill() {
        System.out.println("The car filled up with petrol.");
    }
}