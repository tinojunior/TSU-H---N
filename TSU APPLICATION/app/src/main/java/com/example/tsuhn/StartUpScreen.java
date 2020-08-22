package com.example.tsuhn;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tsuhn.ui.main.SectionsPagerAdapter;

public class StartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup_screen);

        Button button = findViewById(R.id.credsbutton);

        button.setOnClickListener(v -> {


            Intent intent = new Intent(this,Credentials.class);

            startActivity(intent);


        });

        Button button1 = findViewById(R.id.guestbutton);

        button1.setOnClickListener(v -> {

            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);


        });
        
    }

}