package com.example.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements
        FragmentOne.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.fragmentos.R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragment = FragmentOne.newInstance();
        fragmentTransaction.add(com.example.fragmentos.R.id.fragmentOne, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String text, int colorId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTwo fragment = FragmentTwo.newInstance(text, colorId);
        fragmentTransaction.replace(com.example.fragmentos.R.id.fragmentTwo, fragment);
        fragmentTransaction.commit();
    }
}