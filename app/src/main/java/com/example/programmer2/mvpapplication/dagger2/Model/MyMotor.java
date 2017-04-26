package com.example.programmer2.mvpapplication.dagger2.Model;

public class MyMotor {

    private int rpm;

    public MyMotor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm += value;
    }

    public void brake() {
        rpm = 0;
    }
}