package com.teachmeskills.additional.model.car;

import com.teachmeskills.additional.pattern.strategy.car_refill.PetrolRefill;

public class PetrolCar extends Car {
    public PetrolCar() {
        this.refillStrategy = new PetrolRefill();
    }
}