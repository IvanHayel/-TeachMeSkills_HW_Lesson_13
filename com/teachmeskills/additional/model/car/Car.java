package com.teachmeskills.additional.model.car;

import com.teachmeskills.additional.pattern.strategy.car_refill.CarRefillStrategy;

public abstract class Car {
    CarRefillStrategy refillStrategy;

    public void refill(){
        refillStrategy.refill();
    }
}