package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class readActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
    }

    public void home(View view) {
        Intent i=new Intent(readActivity.this, storyBoardActivity.class ); //creating new intent
        startActivity(i);
    }
    public void byMood(View view) {
        Intent i=new Intent(readActivity.this, readByMoodActivity.class ); //creating new intent
        startActivity(i);
    }
    public void byPenName(View view) {
        Intent i=new Intent(readActivity.this, readByPenNameActivity.class ); //creating new intent
        startActivity(i);
    }
}




