package com.example.aishanyasingh.steller;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    EditText email_et;
    EditText pwd_et;

    private final String TAG="LoginActivity";

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user!=null){
            Intent i=new Intent(LoginActivity.this, storyBoardActivity.class);
            i.putExtra("UID",user.getUid());
            startActivity(i);
        }
        //dec
        email_et=(EditText)findViewById(R.id.email_etL);
        pwd_et=(EditText)findViewById(R.id.password_etL);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in

                    Intent i=new Intent(LoginActivity.this,storyBoardActivity.class);
                    i.putExtra("UID",user.getUid());
                    startActivity(i);
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };

    }

    public void signin(View view) {
        String email=email_et.getText().toString();
        String password=pwd_et.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "signInWithEmail:failed", task.getException());
                            Toast.makeText(LoginActivity.this, "failed",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                            Intent i=new Intent(LoginActivity.this,storyBoardActivity.class);
                            i.putExtra("UID",user.getUid());
                            startActivity(i);
                        }

                        // ...
                    }
                });


    }


    public void login(View view) {
        String email=email_et.getText().toString();
        String password=pwd_et.getText().toString();
        if(email=="aishanya1999@gmail.com"&&password=="password") {

            Intent i = new Intent(LoginActivity.this, storyBoardActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(LoginActivity.this, "Incorrect email id or password",
                    Toast.LENGTH_SHORT).show();
        }

    }
}