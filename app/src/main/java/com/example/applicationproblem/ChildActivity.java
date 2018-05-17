package com.example.applicationproblem;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ChildActivity extends AppCompatActivity {

    public static final String LOG_TAG = "ChildActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Log.e(LOG_TAG,"Created");
    }
    protected void onStop(){
        super.onStop();
        Log.e(LOG_TAG,"Stopped" + " -  isFinishing: " + Boolean.toString(isFinishing()));
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(LOG_TAG,"Destroyed");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(LOG_TAG,"Configuration changed");
    }

    public void buttonClick(View v){
        Log.e(LOG_TAG,"ChildButton Clicked");
        Intent resultIntent = new Intent();
        setResult(2, resultIntent);
        finish();
    }
}
