package com.example.bookreview.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.bookreview.R;
import com.example.bookreview.view.fragment.HomeFragment;
import com.example.bookreview.view.fragment.LibraryFragment;
import com.example.bookreview.view.fragment.ProfileFragment;
import com.example.bookreview.view.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.example.bookreview.utils.Constants.LOG_TAG;

public class MainActivity extends AppCompatActivity implements ProfileFragment.OnFragmentInteractionListener,
        SearchFragment.OnFragmentInteractionListener, HomeFragment.OnFragmentInteractionListener,
        LibraryFragment.OnFragmentInteractionListener {

    private final Fragment mProfileFragment = ProfileFragment.newInstance();
    private final Fragment mHomeFragment = HomeFragment.newInstance();
    private final Fragment mSearchFragment = SearchFragment.newInstance();
    private final Fragment mLibraryFragment = LibraryFragment.newInstance();
    private final FragmentManager mFragmentManager = getSupportFragmentManager();

    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;

    private Fragment mActiveFragment = mHomeFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    mFragmentManager.beginTransaction().hide(mActiveFragment).show(mHomeFragment).commit();
                    mActiveFragment = mHomeFragment;
                    return true;

                case R.id.nav_search:
                    mFragmentManager.beginTransaction().hide(mActiveFragment).show(mSearchFragment).commit();
                    mActiveFragment = mSearchFragment;
                    return true;

                case R.id.nav_library:
                    mFragmentManager.beginTransaction().hide(mActiveFragment).show(mLibraryFragment).commit();
                    mActiveFragment = mLibraryFragment;
                    return true;

                case R.id.nav_profile:
                    mFragmentManager.beginTransaction().hide(mActiveFragment).show(mProfileFragment).commit();
                    mActiveFragment = mProfileFragment;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        //get firebase auth instance
        auth = FirebaseAuth.getInstance();

        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch prelogin activity
                    Intent intent = new Intent(MainActivity.this, PreLoginActivity.class);
                    startActivity(intent);
                }
            }
        };

        // Add the fragment instances to fragment manager
        mFragmentManager.beginTransaction().add(R.id.contentContainer, mHomeFragment).commit();
        mFragmentManager.beginTransaction().add(R.id.contentContainer, mProfileFragment).hide(mProfileFragment).commit();
        mFragmentManager.beginTransaction().add(R.id.contentContainer, mSearchFragment).hide(mSearchFragment).commit();
        mFragmentManager.beginTransaction().add(R.id.contentContainer, mLibraryFragment).hide(mLibraryFragment).commit();

        // Set the onNavigationItemSelected listener
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    /**
     * Initialize the contents of the Activity's standard options menu.
     *
     * @param menu the menu
     * @return whether inflation is successful or not
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * This hook is called whenever an item in the options menu is selected.
     *
     * @param item The menu item that was selected.
     * @return false to allow normal menu processing to proceed.
     */
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_sign_out) {
                // Sign out the current user
                FirebaseAuth.getInstance().signOut();
                finish();
                Log.d(LOG_TAG, "User is signed out");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        auth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            auth.removeAuthStateListener(authListener);
        }
    }

    /**
     * Handle interactions between the fragments.
     *
     * @param uri the fragment unique key
     */
    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}