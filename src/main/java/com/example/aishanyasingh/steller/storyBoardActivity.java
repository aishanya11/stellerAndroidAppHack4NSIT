package com.example.aishanyasingh.steller;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class storyBoardActivity extends AppCompatActivity {
    public void sad(View view){
        Intent i=new Intent(storyBoardActivity.this,storyBoxActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_board);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            //case R.id.action_home:

                            //case R.id.action_my_profile:

                            case R.id.action_read: Intent i=new Intent(storyBoardActivity.this,readActivity.class);
                                startActivity(i);
                                break;

                            case R.id.action_write: Intent ij=new Intent(storyBoardActivity.this,writeActivity.class);
                                startActivity(ij);
                                break;
                            case R.id.action_my_profile: Intent j=new Intent(storyBoardActivity.this,myProfileActivity.class);
                                startActivity(j);
                                break;

                        }
                        return true;
                    }
                });
    }



}
