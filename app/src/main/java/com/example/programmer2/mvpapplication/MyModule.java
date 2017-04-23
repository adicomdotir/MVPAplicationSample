package com.example.programmer2.mvpapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yashar.P on 4/23/2017.
 */
@Module
public class MyModule {

    @Provides
    @Singleton
    Circle provideCircle() {
        return new Circle();
    }

    @Provides
    @Singleton
    MainPresenter providePresenter() {
        return new MainPresenter(new Circle());
    }
}
