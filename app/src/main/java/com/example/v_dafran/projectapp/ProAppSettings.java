package com.example.v_dafran.projectapp;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;

import database.DBClass;

/**
 * Created by v-dafran on 10/03/2016.
 */

public class ProAppSettings extends Activity {

    private static final String APP_NAME = "ProjectApp";
    private static final boolean DEBUG_FLAG = false;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new ProAppSettingsFragment()).commit();
    }

    public void onDestroy() {
        super.onDestroy();

        if ( DEBUG_FLAG ) Log.v(APP_NAME, "ProAppSettings :: onDestroy(): erase switch state: " + PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_erase_all", false));

        if ( PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_erase_all", false) ) {
            //delete databases
            DBClass proappDataOp = new DBClass(this);
            proappDataOp.cleanAllTables();
            proappDataOp.close();

            //switch the switch back
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("pref_erase_all", false).commit();
        }
    }
}

