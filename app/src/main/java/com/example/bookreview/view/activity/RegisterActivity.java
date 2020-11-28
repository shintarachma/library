package com.example.bookreview.view.activity;


import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookreview.databinding.ActivityRegisterBinding;
import com.example.bookreview.R;
import com.example.bookreview.viewmodel.RegisterViewModel;
import com.example.bookreview.viewmodel.RegisterViewModelFactory;


/**
 * Register activity for users to create an account.
 */
public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding mActivityRegisterBinding;
    private RegisterViewModel mRegisterViewModel;

    /**
     * Called when activity is first created.
     *
     * @param savedInstanceState Bundle object containing the activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityRegisterBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        mRegisterViewModel = new ViewModelProvider(this, new RegisterViewModelFactory(getApplication()))
                .get(RegisterViewModel.class);
        mActivityRegisterBinding.setRegisterViewModel(mRegisterViewModel);
    }

}
