package com.example.bookreview.view.activity;

import androidx.lifecycle.ViewModelProviders;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.example.bookreview.R;
import com.example.bookreview.databinding.ActivityLoginBinding;
import com.example.bookreview.viewmodel.LoginViewModel;
import com.example.bookreview.viewmodel.LoginViewModelFactory;

/**
 * Login activity that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding mActivityLoginBinding;
    private LoginViewModel mLoginViewModel;

    /**
     * Called when activity is first created.
     *
     * @param savedInstanceState Bundle object containing the activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mLoginViewModel = ViewModelProviders.of(this, new LoginViewModelFactory(getApplication(), FirebaseAuth.getInstance()))
                .get(LoginViewModel.class);
        mActivityLoginBinding.setLoginViewModel(mLoginViewModel);
    }

}
