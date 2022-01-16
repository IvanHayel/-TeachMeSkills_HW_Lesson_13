package com.teachmeskills.additional.model.car;

import com.teachmeskills.additional.pattern.strategy.car_refill.GasRefill;

public class GasCar extends Car {
    public GasCar() {
        this.refillStrategy = new GasRefill();
    }
}