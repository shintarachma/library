package com.example.bookreview.viewmodel;

import android.app.Application;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

import com.example.bookreview.R;
import com.example.bookreview.utils.Constants;
import com.example.bookreview.utils.FirebaseRepository;

import java.lang.ref.WeakReference;

import static com.example.bookreview.utils.Constants.LOG_TAG;

/**
 * ViewModel that handles the logic for register activity.
 */
public class RegisterViewModel extends ViewModel {

    private Application mApplication;
    private FirebaseRepository mFirebaseRepo;
//    private WeakReference<RegisterNavigator> mRegisterNavigator;


    public ObservableField<String> email = new ObservableField<String>();
    public ObservableField<String> password = new ObservableField<String>();
    public ObservableField<String> firstName = new ObservableField<String>();
    public ObservableField<String> lastName = new ObservableField<String>();

    public ObservableField<String> emailError = new ObservableField<String>();
    public ObservableField<String> passwordError = new ObservableField<String>();
    public ObservableField<String> firstNameError = new ObservableField<String>();
    public ObservableField<String> lastNameError = new ObservableField<String>();

    public ObservableField<Boolean> fabIsShown = new ObservableField<Boolean>();
    public ObservableField<Boolean> progressIsShown = new ObservableField<Boolean>();

    /**
     * Constructor for Register ViewModel
     *
     * @param application The application
     */
    public RegisterViewModel(Application application) {
        mApplication = application;
        mFirebaseRepo = FirebaseRepository.getInstance();

        fabIsShown.set(true);
    }

//    /**
//     * Set the reference for the Register Navigator
//     *
//     * @param registerNavigator the register navigation
//     */
//    public void setRegisterNavigator(RegisterNavigator registerNavigator) {
//        mRegisterNavigator = new WeakReference<>(registerNavigator);
//    }

    /**
     * Attempts to register specified by the register form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual register attempt is made.
     */
    public void attemptRegister(View view) {
        // Reset errors.
        emailError.set(null);
        passwordError.set(null);
        firstNameError.set(null);
        lastNameError.set(null);

        // Store values at the time of the register attempt.
        String email = this.email.get();
        String password = this.password.get();
        String firstName = this.firstName.get();
        String lastName = this.lastName.get();

        boolean allFieldsAreValid = validateFields(email, password, firstName, lastName);

        // There was no error
        if (allFieldsAreValid) {
            // Run AsyncTask
            new RegisterAsyncTask().execute();
            Log.d(LOG_TAG, "Attempting register");
        }
    }

    /**
     * Validate all the fields.
     *
     * @param email       user email
     * @param password    user password
     * @param firstName   user first name
     * @param lastName    user last name
     * @return true if all fields are valid and vice versa
     */
    private boolean validateFields(String email, String password, String firstName, String lastName) {
        boolean allFieldsAreValid = true;

        // Check for a valid email address.
        if (TextUtils.isEmpty(email)) {
            emailError.set(mApplication.getString(R.string.error_field_required));
            allFieldsAreValid = false;
        } else if (!isEmailValid(email)) {
            emailError.set(mApplication.getString(R.string.error_invalid_email));
            allFieldsAreValid = false;
        }

        // Check for a valid password.
        if (TextUtils.isEmpty(password)) {
            passwordError.set(mApplication.getString(R.string.error_field_required));
            allFieldsAreValid = false;
        } else if (!isPasswordValid(password)) {
            passwordError.set(mApplication.getString(R.string.error_invalid_password));
            allFieldsAreValid = false;
        }

        // Check for a valid first name.
        if (TextUtils.isEmpty(firstName)) {
            firstNameError.set(mApplication.getString(R.string.error_field_required));
            allFieldsAreValid = false;
        } else if (!isNameValid(firstName)) {
            firstNameError.set(mApplication.getString(R.string.error_invalid_name));
            allFieldsAreValid = false;
        }

        // Check for a valid last name.
        if (TextUtils.isEmpty(lastName)) {
            lastNameError.set(mApplication.getString(R.string.error_field_required));
            allFieldsAreValid = false;
        } else if (!isNameValid(lastName)) {
            lastNameError.set(mApplication.getString(R.string.error_invalid_name));
            allFieldsAreValid = false;
        }

        return allFieldsAreValid;
    }

    /**
     * Check if email is in valid format
     *
     * @param email email address
     * @return whether it is in valid format
     */
    private boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    /**
     * Check if password is in valid format
     *
     * @param password password
     * @return whether it is in valid format
     */
    private boolean isPasswordValid(String password) {
        return password.length() >= 6;
    }

    /**
     * Check if name is in valid format
     *
     * @param name name
     * @return whether it is in valid format
     */
    private boolean isNameValid(String name) {
        return name.matches(Constants.REGEX_NAME);
    }

    /**
     * Set the EditText error message using binding adapter
     *
     * @param editText     the EditText
     * @param errorMessage the error message
     */
    @BindingAdapter("app:errorText")
    public static void setErrorMessage(EditText editText, String errorMessage) {
        editText.setError(errorMessage);
    }


    /**
     * AsyncTask to attempt register.
     * Show the progress bar during the process.
     */
    private class RegisterAsyncTask extends AsyncTask<Void, Void, Void> {

        /**
         * Show the progress bar
         */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Show a progress spinner
            progressIsShown.set(true);
        }

        /**
         * Attempt registration using Firebase
         *
         * @param voids void
         * @return null
         */
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Attempt registration in Firebase
            mFirebaseRepo.register(email.get(), password.get(), firstName.get(), lastName.get(), mApplication);
            return null;
        }

        /**
         * Hide the progress bar
         *
         * @param aVoid void
         */
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // Hide the progress spinner
            progressIsShown.set(false);
        }
    }

}
