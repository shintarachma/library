package com.example.bookreview.viewmodel;

import android.app.Application;

import androidx.lifecycle.ViewModel;

/**
 * ViewModel that handles the logic for prelogin activity.
 */
public class PreLoginViewModel extends ViewModel {

    private Application mApplication;

    /**
     * Constructor for PreLogin ViewModel
     *
     * @param application The application
     */
    public PreLoginViewModel(Application application) {
        mApplication = application;
    }
}
