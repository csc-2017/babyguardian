package com.example.somebody.babyguardian;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI Buttons
        Button buttonBluetooth = (Button) findViewById(R.id.buttonBluetooth);
        Button buttonSettings = (Button) findViewById(R.id.buttonSettings);
        Button buttonVitals = (Button) findViewById(R.id.buttonVitals);
        Button buttonSignIn = (Button) findViewById(R.id.buttonSignIn);

        //bluetooth button intent
        buttonBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bluetoothLE.class);
                startActivity(intent);
            }
        });

        //settings button intent
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        //vitals button intent
        // need to add code to handle serialization and buffering incoming data
        buttonVitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayVitals.class);
                startActivity(intent);
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}