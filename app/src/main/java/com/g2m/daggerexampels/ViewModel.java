package com.g2m.daggerexampels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

public class ViewModel implements ViewModelProvider.Factory {
    @NonNull
    @Override
    public <T extends androidx.lifecycle.ViewModel> T create(@NonNull Class<T> modelClass) {
        return null;
    }
}
