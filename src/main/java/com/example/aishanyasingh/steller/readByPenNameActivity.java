package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class readByPenNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_by_pen_name);
    }

    public void search(View view) {
        Intent i=new Intent(readByPenNameActivity.this,userProfileActivity.class);
        startActivity(i);

    }
}
