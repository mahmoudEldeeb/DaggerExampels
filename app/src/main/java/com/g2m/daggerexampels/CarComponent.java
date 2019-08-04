package com.g2m.daggerexampels;


import dagger.Component;

@Component
public interface CarComponent {
    //Car getCar();
    void inject(MainActivity mainActivity);
}
