package com.example.programmer2.mvpapplication.dagger2;

import com.example.programmer2.mvpapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Yashar.P on 4/24/2017.
 */

@Singleton
@Component(modules = {MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity activty);
}
