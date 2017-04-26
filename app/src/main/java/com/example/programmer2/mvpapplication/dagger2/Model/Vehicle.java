package com.example.programmer2.mvpapplication.dagger2.Model;

import javax.inject.Inject;

public class Vehicle {

    private MyMotor motor;

    @Inject
    public Vehicle(MyMotor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}