package com.example.aishanyasingh.steller;




import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class createAccountActivity extends AppCompatActivity {

    EditText nameEt;
    EditText pwdEt;
    EditText emailEt;
    EditText pennameEt;
    EditText bioEt;

    String name2;
    String pwd2;
    String email2;
    String penname2;
    String bio2;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference mDatabase;
    private final String DB = "db1";

    private final String TAG="SignUpActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        mAuth = FirebaseAuth.getInstance();

        //dec
        nameEt=(EditText)findViewById(R.id.name);
        pennameEt=(EditText)findViewById(R.id.penname);
        pwdEt=(EditText)findViewById(R.id.password);
        bioEt=(EditText)findViewById(R.id.bio);
        emailEt=(EditText)findViewById(R.id.email);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {

                    final String email=emailEt.getText().toString();
                    String password=pwdEt.getText().toString();
                    final String name=nameEt.getText().toString();
                    final String penname=pennameEt.getText().toString();
                    final String bio=bioEt.getText().toString();
                    // User is signed in
                    mDatabase = FirebaseDatabase.getInstance().getReference().child(DB).child("Users");
                    UserObject newEntry=new UserObject();
                    newEntry.setEmail(email);
                    newEntry.setName(name);
                    newEntry.setUid(user.getUid());
                    newEntry.setPenname(penname);
                    newEntry.setBio(bio);


                    mDatabase.child(user.getUid()).setValue(newEntry, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                            if (firebaseError != null) {
                                Toast.makeText(createAccountActivity.this, "Error", Toast.LENGTH_LONG).show();
                                Log.e("Firebase writing error", firebaseError.getMessage());
                            } else {
                                Toast.makeText(createAccountActivity.this, "Sign up added successfully", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                    Intent i=new Intent(createAccountActivity.this,storyBoardActivity.class);
                    i.putExtra("UID",user.getUid());
                    startActivity(i);
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };

    }

    public void signUp(View view) {
        final String email=emailEt.getText().toString();
        String password=pwdEt.getText().toString();
        final String name=nameEt.getText().toString();
        final String penname=pennameEt.getText().toString();
        final String bio=bioEt.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());





                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(createAccountActivity.this, "auth failed",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            mDatabase = FirebaseDatabase.getInstance().getReference().child(DB).child("Users");
                            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                            UserObject newEntry=new UserObject();
                            newEntry.setEmail(email);
                            newEntry.setName(name);
                            newEntry.setUid(user.getUid());
                            newEntry.setPenname(penname);
                            newEntry.setBio(bio);


                            mDatabase.child(user.getUid()).setValue(newEntry, new DatabaseReference.CompletionListener() {
                                @Override
                                public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                                    if (firebaseError != null) {
                                        Toast.makeText(createAccountActivity.this, "Error", Toast.LENGTH_LONG).show();
                                        Log.e("Firebase writing error", firebaseError.getMessage());
                                    } else {
                                        Toast.makeText(createAccountActivity.this, "Sign up added successfully", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }

                        // ...
                    }
                });


    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }


    public void sign(View view) {
        Intent i=new Intent(createAccountActivity.this,storyBoardActivity.class);
        startActivity(i);
    }
}
