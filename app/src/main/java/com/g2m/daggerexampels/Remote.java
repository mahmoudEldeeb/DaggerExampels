package com.g2m.daggerexampels;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    @Inject
    public Remote() {
    }
    public void setListener(Car car){
        Log.v("car","listenerr");
    }
}
