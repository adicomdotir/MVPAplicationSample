package com.example.programmer2.mvpapplication.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yashar.P on 4/24/2017.
 */

@Module
public class MotorModule {
    String motoName;
    String computerName;
    String radiatorName;
    int voltage;

    public MotorModule(String computerName, int voltage, String radiatorName) {
        this.radiatorName = radiatorName;
        this.computerName = computerName;
        this.voltage = voltage;
    }

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor(motoName);
    }

    @Provides
    @Singleton
    Computer provideComputer() {
        return new Computer(computerName, voltage);
    }

    @Provides
    @Singleton
    Radiator provideRadiator(){
        return new Radiator(radiatorName);
    }
}
