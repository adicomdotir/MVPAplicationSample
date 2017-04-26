package com.example.programmer2.mvpapplication.dagger2;

import com.example.programmer2.mvpapplication.dagger2.Model.Vehicle;
import com.example.programmer2.mvpapplication.dagger2.Module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Yashar.P on 4/26/2017.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
