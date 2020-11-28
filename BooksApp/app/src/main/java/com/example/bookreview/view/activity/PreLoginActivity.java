package com.example.bookreview.view.activity;


import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookreview.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * Show the options for user to register or login before using the application.
 */
public class PreLoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    /**
     * Called when activity is first created.
     *
     * @param savedInstanceState Bundle object containing the activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);

        // Check if the user is logged in, if yes redirect to navigation  activity
        mAuth = FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
//                if (firebaseUser != null) {
//                    Log.d(LOG_TAG, "User is logged in, redirecting to Navigation Activity");
//                    Intent intent = new Intent(PreLoginActivity.this, NavigationActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
            }
        };

    }


    /**
     * Launch the register activity.
     *
     * @param view the view
     */
    public void launchRegisterActivity(View view) {
        Intent registerIntent = new Intent(PreLoginActivity.this, RegisterActivity.class);
        startActivity(registerIntent);
    }

    /**
     * Launch the login activity.
     *
     * @param view the view
     */
    public void launchLoginActivity(View view) {
        Intent loginIntent = new Intent(PreLoginActivity.this, LoginActivity.class);
        startActivity(loginIntent);
    }

    /**
     * onStart lifecycle.
     */
    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthStateListener);
    }

    /**
     * onStop lifecycle.
     */
    @Override
    protected void onStop() {
        super.onStop();
        mAuth.removeAuthStateListener(mAuthStateListener);
    }
}

