package com.example.applicationproblem;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class MainViewModel extends ViewModel {
    private String text;

    @Override
    protected void onCleared(){
        super.onCleared();
        Log.e("MainViewModel","MainViewModel cleared!");
    }

    public void setText(String newText){
        text = newText;
    }
}
