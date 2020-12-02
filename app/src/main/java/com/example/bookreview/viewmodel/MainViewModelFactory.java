package com.example.bookreview.viewmodel;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private Application mApplication;

    /**
     * Constructor that creates the factory
     *
     * @param application the application
     */
    public MainViewModelFactory(Application application) {
        mApplication = application;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new MainViewModel(mApplication);
    }
}
