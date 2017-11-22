package com.example.pc.coches;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * Created by Pc on 22/11/2017.
 */
// extendemos prferenceFragment para las preferencias
public class SettingsFragment extends PreferenceFragment {
    private SharedPreferences prefs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //lo relacinamos con settings.xml
            addPreferencesFromResource(R.xml.settings);
    }

    //Arranca las preferencias y obtine las preferencias compartidas actuales
    @Override
    public void onStart() {
            super.onStart();
            prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }
}