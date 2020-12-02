package com.example.bookreview.viewmodel;

import android.app.Application;
import androidx.lifecycle.ViewModel;

import com.example.bookreview.utils.FirebaseRepository;

public class MainViewModel extends ViewModel {

    private Application mApplication;
    private FirebaseRepository mFirebaseRepo;

    /**
     * Constructor for Navigation ViewModel
     *
     * @param application The application
     */
    public MainViewModel(Application application) {
        mApplication = application;
        mFirebaseRepo = FirebaseRepository.getInstance();
    }
}
