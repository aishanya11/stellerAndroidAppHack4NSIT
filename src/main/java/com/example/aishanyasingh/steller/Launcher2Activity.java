package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Launcher2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher2);
    }

    public void sign(View view) {
        Intent i=new Intent(Launcher2Activity.this, createAccountActivity.class );
        startActivity(i);
    }
    public void login(View view) {
        Intent i=new Intent(Launcher2Activity.this, LoginActivity.class );
        startActivity(i);
    }
}

