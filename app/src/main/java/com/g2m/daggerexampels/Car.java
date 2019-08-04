package com.g2m.daggerexampels;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    Wheel wheel;
   @Inject Engine engine;

    @Inject
    public Car(Wheel wheel) {
        this.wheel = wheel;

    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        Log.v("car","drive");
    }
}
