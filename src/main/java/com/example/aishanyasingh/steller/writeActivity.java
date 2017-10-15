package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class writeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }

    public void happy(View view) {
        Intent i=new Intent(writeActivity.this,write2Activity.class);
        startActivity(i);
    }
}
