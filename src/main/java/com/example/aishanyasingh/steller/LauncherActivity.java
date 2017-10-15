package com.example.aishanyasingh.steller;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.value;

public class LauncherActivity extends AppCompatActivity {

    private static int init_time=2700;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                Intent homeIntent = new Intent(LauncherActivity.this, Launcher2Activity.class);
                startActivity(homeIntent);
                finish();
            }
        },init_time);


    }
}