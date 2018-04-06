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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_main);
    }

    protected void goBasicLayout(View v) {
        Intent k = new Intent(MainActivity.this, ButtonActivity.class);
        startActivity(k);
    }

    protected void goClockLayout(View v) {
        Intent k = new Intent(MainActivity.this, ClockActivity.class);
        startActivity(k);
    }

}
