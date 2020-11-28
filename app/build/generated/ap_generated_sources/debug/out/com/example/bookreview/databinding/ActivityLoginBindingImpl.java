package com.example.bookreview.databinding;
import com.example.bookreview.R;
import com.example.bookreview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_login_imageView, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mLoginViewModelAttemptLoginAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener activityLoginEmailEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.email.get()
            //         is loginViewModel.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoginEmailEt);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.email
            androidx.databinding.ObservableField<java.lang.String> loginViewModelEmail = null;
            // loginViewModel.email != null
            boolean loginViewModelEmailJavaLangObjectNull = false;
            // loginViewModel
            com.example.bookreview.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.email.get()
            java.lang.String loginViewModelEmailGet = null;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelEmail = loginViewModel.email;

                loginViewModelEmailJavaLangObjectNull = (loginViewModelEmail) != (null);
                if (loginViewModelEmailJavaLangObjectNull) {




                    loginViewModelEmail.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoginPasswordEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.password.get()
            //         is loginViewModel.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoginPasswordEt);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.password
            androidx.databinding.ObservableField<java.lang.String> loginViewModelPassword = null;
            // loginViewModel
            com.example.bookreview.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.password.get()
            java.lang.String loginViewModelPasswordGet = null;
            // loginViewModel.password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.password;

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.Button) bindings[3]
            );
        this.activityLoginEmailEt.setTag(null);
        this.activityLoginPasswordEt.setTag(null);
        this.activityLoginProgressBar.setTag(null);
        this.activityLoginSignInButton.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.example.bookreview.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.example.bookreview.viewmodel.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelProgressIsShown((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeLoginViewModelPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeLoginViewModelEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeLoginViewModelPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelEmailError(androidx.databinding.ObservableField<java.lang.String> LoginViewModelEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelProgressIsShown(androidx.databinding.ObservableField<java.lang.Boolean> LoginViewModelProgressIsShown, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelPasswordError(androidx.databinding.ObservableField<java.lang.String> LoginViewModelPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelEmail(androidx.databinding.ObservableField<java.lang.String> LoginViewModelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(androidx.databinding.ObservableField<java.lang.String> LoginViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener loginViewModelAttemptLoginAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelEmailError = null;
        androidx.databinding.ObservableField<java.lang.Boolean> loginViewModelProgressIsShown = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelPasswordError = null;
        int loginViewModelProgressIsShownViewVISIBLEViewGONE = 0;
        java.lang.String loginViewModelEmailErrorGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelProgressIsShownGet = false;
        java.lang.String loginViewModelPasswordGet = null;
        java.lang.String loginViewModelPasswordErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelEmail = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelPassword = null;
        java.lang.Boolean loginViewModelProgressIsShownGet = null;
        com.example.bookreview.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;
        java.lang.String loginViewModelEmailGet = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x60L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel::attemptLogin
                        loginViewModelAttemptLoginAndroidViewViewOnClickListener = (((mLoginViewModelAttemptLoginAndroidViewViewOnClickListener == null) ? (mLoginViewModelAttemptLoginAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mLoginViewModelAttemptLoginAndroidViewViewOnClickListener).setValue(loginViewModel));
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.emailError
                        loginViewModelEmailError = loginViewModel.emailError;
                    }
                    updateRegistration(0, loginViewModelEmailError);


                    if (loginViewModelEmailError != null) {
                        // read loginViewModel.emailError.get()
                        loginViewModelEmailErrorGet = loginViewModelEmailError.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.progressIsShown
                        loginViewModelProgressIsShown = loginViewModel.progressIsShown;
                    }
                    updateRegistration(1, loginViewModelProgressIsShown);


                    if (loginViewModelProgressIsShown != null) {
                        // read loginViewModel.progressIsShown.get()
                        loginViewModelProgressIsShownGet = loginViewModelProgressIsShown.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.progressIsShown.get())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelProgressIsShownGet = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelProgressIsShownGet);
                if((dirtyFlags & 0x62L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxLoginViewModelProgressIsShownGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
                    loginViewModelProgressIsShownViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLoginViewModelProgressIsShownGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.passwordError
                        loginViewModelPasswordError = loginViewModel.passwordError;
                    }
                    updateRegistration(2, loginViewModelPasswordError);


                    if (loginViewModelPasswordError != null) {
                        // read loginViewModel.passwordError.get()
                        loginViewModelPasswordErrorGet = loginViewModelPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.email
                        loginViewModelEmail = loginViewModel.email;
                    }
                    updateRegistration(3, loginViewModelEmail);


                    if (loginViewModelEmail != null) {
                        // read loginViewModel.email.get()
                        loginViewModelEmailGet = loginViewModelEmail.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.password
                        loginViewModelPassword = loginViewModel.password;
                    }
                    updateRegistration(4, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read loginViewModel.password.get()
                        loginViewModelPasswordGet = loginViewModelPassword.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoginEmailEt, loginViewModelEmailGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityLoginEmailEt, loginViewModelEmailErrorGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoginEmailEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoginEmailEtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoginPasswordEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoginPasswordEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoginPasswordEt, loginViewModelPasswordGet);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityLoginPasswordEt, loginViewModelPasswordErrorGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.activityLoginProgressBar.setVisibility(loginViewModelProgressIsShownViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.activityLoginSignInButton.setOnClickListener(loginViewModelAttemptLoginAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.bookreview.viewmodel.LoginViewModel value;
        public OnClickListenerImpl setValue(com.example.bookreview.viewmodel.LoginViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.attemptLogin(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.emailError
        flag 1 (0x2L): loginViewModel.progressIsShown
        flag 2 (0x3L): loginViewModel.passwordError
        flag 3 (0x4L): loginViewModel.email
        flag 4 (0x5L): loginViewModel.password
        flag 5 (0x6L): loginViewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}