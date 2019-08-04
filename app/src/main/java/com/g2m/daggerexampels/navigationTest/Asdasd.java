package com.g2m.daggerexampels.navigationTest;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Asdasd extends ViewModel {
    public static int i=0;
    public String a;
    MutableLiveData<Integer>res;
    public Asdasd(){
        res=new MutableLiveData<>();
    }

    public MutableLiveData<Integer> get(){

        i++;
        res.setValue(i);
        return res;
    }
}
