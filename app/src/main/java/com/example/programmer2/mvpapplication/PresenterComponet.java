package com.example.programmer2.mvpapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Yashar.P on 4/23/2017.
 */

@Singleton
@Component(modules = {MyModule.class})
public interface PresenterComponet {
    MainPresenter providePresent();
}
