package com.example.programmer2.mvpapplication.dagger2;

/**
 * Created by Yashar.P on 4/24/2017.
 */

public class Computer {
    private int voltage;
    private String model;

    public Computer(String model, int voltage){
        this.model = model;
        this.voltage = voltage;
    }
}
