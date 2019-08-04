package com.g2m.daggerexampels.di;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String asd(){
        return "asddf";
    }
}
