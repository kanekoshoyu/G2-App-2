package com.example.axu1.richarddawkinsalarmclock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_button);

    }

    protected void onButtonPressed(View v) {
        String text_on_button = ((Button) findViewById(R.id.button_basic)).getText().toString();
        if (text_on_button.equals("ON")){
            text_on_button="OFF";
        }else{
            text_on_button="ON";
        }
        ((Button) findViewById(R.id.button_basic)).setText(text_on_button);
    }
}