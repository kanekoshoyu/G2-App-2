package com.example.axu1.richarddawkinsalarmclock;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    String EXTRA_ADDRESS = "device_address";
    String address=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent newint = getIntent();
        address = newint.getStringExtra(DeviceList.EXTRA_ADDRESS);
        setContentView(R.layout.ui_main);
    }

    protected void goBasicLayout(View v) {
        Intent i = new Intent(MainActivity.this, ButtonActivity.class);
        //Change the activity.
        i.putExtra(EXTRA_ADDRESS, address); //this will be received at ledControl (class) Activity
        startActivity(i);
    }

    protected void goClockLayout(View v) {
        Intent k = new Intent(MainActivity.this, ClockActivity.class);
        startActivity(k);
    }

}
