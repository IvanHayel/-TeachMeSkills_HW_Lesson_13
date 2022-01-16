package com.teachmeskills.additional.model.car;

import com.teachmeskills.additional.pattern.strategy.car_refill.DieselRefill;

public class DieselCar extends Car {
    public DieselCar() {
        this.refillStrategy = new DieselRefill();
    }
}