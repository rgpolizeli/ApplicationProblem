package com.example.applicationproblem;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MainViewModel model;
    public static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = ViewModelProviders.of(this).get(MainViewModel.class);
        Log.e(LOG_TAG,"Created");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(LOG_TAG,"Configuration changed");
    }

    protected void onStop(){
        super.onStop();
        Log.e(LOG_TAG,"Stopped" + " -  isFinishing: " + Boolean.toString(isFinishing()));

    }

    @Override
    protected void onDestroy(){
        Log.e(LOG_TAG,"Before Destroy" + " -  isFinishing: " + Boolean.toString(isFinishing()));
        super.onDestroy();
        Log.e(LOG_TAG,"Destroyed");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        Log.e(LOG_TAG,"Result received");
    }

    public void buttonClick(View v){
        Log.e(LOG_TAG,"MainButton Clicked");
        Intent i = new Intent(v.getContext(), ChildActivity.class);
        startActivityForResult(i,1);
    }
}
