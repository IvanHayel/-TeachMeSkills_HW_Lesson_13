package com.teachmeskills.additional.model.car;

import com.teachmeskills.additional.pattern.strategy.car_refill.ElectricityRefill;

public class ElectricCar extends Car {
    public ElectricCar() {
        this.refillStrategy = new ElectricityRefill();
    }
}