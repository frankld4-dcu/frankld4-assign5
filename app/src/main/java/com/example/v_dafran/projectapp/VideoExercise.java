package com.example.v_dafran.projectapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import workoutvideos.AbsListView;
import workoutvideos.ArmListView;
import workoutvideos.BackListView;
import workoutvideos.ChestListView;
import workoutvideos.LegListView;
import workoutvideos.ShoulderListView;

/**
 * Created by v-dafran on 08/03/2016.
 */

public class VideoExercise extends Activity{

    /**
     * This method creates the muscle skeleton activity layout as set by the linear layout in activity_rugby
     * It also initalises the team names so the entered data can be stored for later use.
     * @param savedInstanceState    containing state information (key-value pairs).
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skeleton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void absList (View v) {
    Intent intent = new Intent(VideoExercise.this, AbsListView.class);
    startActivity(intent);
    }

    public void armList (View v) {
        Intent intent = new Intent(VideoExercise.this, ArmListView.class);
        startActivity(intent);
    }

    public void legsList (View v) {
        Intent intent = new Intent(VideoExercise.this, LegListView.class);
        startActivity(intent);
    }

    public void chestList (View v) {
        Intent intent = new Intent(VideoExercise.this, ChestListView.class);
        startActivity(intent);
    }

    public void shoulderList (View v) {
        Intent intent = new Intent(VideoExercise.this, ShoulderListView.class);
        startActivity(intent);
    }

    public void backList (View v) {
        Intent intent = new Intent(VideoExercise.this, BackListView.class);
        startActivity(intent);
    }
}

