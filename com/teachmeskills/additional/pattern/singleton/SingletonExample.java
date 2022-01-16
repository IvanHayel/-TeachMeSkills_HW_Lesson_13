package com.teachmeskills.additional.pattern.singleton;

import java.math.BigInteger;

public class SingletonExample {
    private static SingletonExample singletonInstance;

    private BigInteger value;

    protected SingletonExample(){
        value = BigInteger.valueOf(3_000_000L);
    }

    public static SingletonExample instance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }

    public BigInteger getCurrentValue(){
        return value;
    }

    public void increaseValue(long value){
       this.value = this.value.add(BigInteger.valueOf(value));
    }

    public void decreaseValue(long value){
        this.value = this.value.subtract(BigInteger.valueOf(value));
    }
}