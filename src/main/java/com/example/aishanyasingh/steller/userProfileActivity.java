package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class userProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void message(View view) {
        Intent i=new Intent(userProfileActivity.this,enterMessageActivity.class);
        startActivity(i);
    }
}
