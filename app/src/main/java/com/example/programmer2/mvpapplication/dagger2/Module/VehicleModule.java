package com.example.programmer2.mvpapplication.dagger2.Module;

import com.example.programmer2.mvpapplication.dagger2.Model.MyMotor;
import com.example.programmer2.mvpapplication.dagger2.Model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {
    @Provides
    @Singleton
    MyMotor provideMotor() {
        return new MyMotor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new MyMotor());
    }
}