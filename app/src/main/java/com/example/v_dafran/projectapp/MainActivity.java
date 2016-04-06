package com.example.v_dafran.projectapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import workoutadapters.Workout;
import reports.ReportConfigurator;


public class MainActivity extends Activity implements View.OnClickListener{

    private static final String APP_NAME = "ProjectApp";
    private static final boolean DEBUG_FLAG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.button_workout)).setOnClickListener(this);
        (findViewById(R.id.button_videos)).setOnClickListener(this);
        (findViewById(R.id.button_tracker)).setOnClickListener(this);
        (findViewById(R.id.button_graphs)).setOnClickListener(this);
        (findViewById(R.id.button_settings)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_workout:
                startActivity(new Intent(this, Workout.class));
                break;

            case R.id.button_videos:
                startActivity(new Intent(this, VideoExercise.class) );
                break;

            case R.id.button_tracker:
                startActivity(new Intent(this, Tracker.class));
                break;

            case R.id.button_graphs:
                startActivity(new Intent(this, ReportConfigurator.class));
                break;

            case R.id.button_settings:
                startActivity(new Intent(this, ProAppSettings.class));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreateOptionsMenu()");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
