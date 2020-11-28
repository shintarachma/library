package com.example.bookreview.databinding;
import com.example.bookreview.R;
import com.example.bookreview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mRegisterViewModelAttemptRegisterAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener activityRegisterEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.email.get()
            //         is registerViewModel.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityRegisterEmail);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel.email.get()
            java.lang.String registerViewModelEmailGet = null;
            // registerViewModel
            com.example.bookreview.viewmodel.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.email
            androidx.databinding.ObservableField<java.lang.String> registerViewModelEmail = null;
            // registerViewModel.email != null
            boolean registerViewModelEmailJavaLangObjectNull = false;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelEmail = registerViewModel.email;

                registerViewModelEmailJavaLangObjectNull = (registerViewModelEmail) != (null);
                if (registerViewModelEmailJavaLangObjectNull) {




                    registerViewModelEmail.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityRegisterFirstNameEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.firstName.get()
            //         is registerViewModel.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityRegisterFirstNameEt);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel.firstName
            androidx.databinding.ObservableField<java.lang.String> registerViewModelFirstName = null;
            // registerViewModel
            com.example.bookreview.viewmodel.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.firstName != null
            boolean registerViewModelFirstNameJavaLangObjectNull = false;
            // registerViewModel.firstName.get()
            java.lang.String registerViewModelFirstNameGet = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelFirstName = registerViewModel.firstName;

                registerViewModelFirstNameJavaLangObjectNull = (registerViewModelFirstName) != (null);
                if (registerViewModelFirstNameJavaLangObjectNull) {




                    registerViewModelFirstName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityRegisterLastNameEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.lastName.get()
            //         is registerViewModel.lastName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityRegisterLastNameEt);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel.lastName != null
            boolean registerViewModelLastNameJavaLangObjectNull = false;
            // registerViewModel
            com.example.bookreview.viewmodel.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.lastName
            androidx.databinding.ObservableField<java.lang.String> registerViewModelLastName = null;
            // registerViewModel.lastName.get()
            java.lang.String registerViewModelLastNameGet = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelLastName = registerViewModel.lastName;

                registerViewModelLastNameJavaLangObjectNull = (registerViewModelLastName) != (null);
                if (registerViewModelLastNameJavaLangObjectNull) {




                    registerViewModelLastName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityRegisterPasswordEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.password.get()
            //         is registerViewModel.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityRegisterPasswordEt);
            // localize variables for thread safety
            // registerViewModel.password != null
            boolean registerViewModelPasswordJavaLangObjectNull = false;
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.example.bookreview.viewmodel.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.password
            androidx.databinding.ObservableField<java.lang.String> registerViewModelPassword = null;
            // registerViewModel.password.get()
            java.lang.String registerViewModelPasswordGet = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelPassword = registerViewModel.password;

                registerViewModelPasswordJavaLangObjectNull = (registerViewModelPassword) != (null);
                if (registerViewModelPasswordJavaLangObjectNull) {




                    registerViewModelPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.AutoCompleteTextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.Button) bindings[5]
            );
        this.activityRegisterEmail.setTag(null);
        this.activityRegisterFirstNameEt.setTag(null);
        this.activityRegisterLastNameEt.setTag(null);
        this.activityRegisterPasswordEt.setTag(null);
        this.activityRegisterProgressBar.setTag(null);
        this.activityRegisterRegisterButton.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.registerViewModel == variableId) {
            setRegisterViewModel((com.example.bookreview.viewmodel.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterViewModel(@Nullable com.example.bookreview.viewmodel.RegisterViewModel RegisterViewModel) {
        this.mRegisterViewModel = RegisterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.registerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterViewModelLastName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeRegisterViewModelPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeRegisterViewModelEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeRegisterViewModelLastNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeRegisterViewModelProgressIsShown((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeRegisterViewModelFirstNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeRegisterViewModelPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeRegisterViewModelFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeRegisterViewModelEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterViewModelLastName(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelPasswordError(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelEmail(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelLastNameError(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelLastNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelProgressIsShown(androidx.databinding.ObservableField<java.lang.Boolean> RegisterViewModelProgressIsShown, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelFirstNameError(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelFirstNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelPassword(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelFirstName(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelEmailError(androidx.databinding.ObservableField<java.lang.String> RegisterViewModelEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        androidx.databinding.ObservableField<java.lang.String> registerViewModelLastName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxRegisterViewModelProgressIsShownGet = false;
        java.lang.String registerViewModelLastNameErrorGet = null;
        java.lang.String registerViewModelPasswordErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelPasswordError = null;
        com.example.bookreview.viewmodel.RegisterViewModel registerViewModel = mRegisterViewModel;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelEmail = null;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelLastNameError = null;
        java.lang.String registerViewModelPasswordGet = null;
        java.lang.String registerViewModelFirstNameGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> registerViewModelProgressIsShown = null;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelFirstNameError = null;
        android.view.View.OnClickListener registerViewModelAttemptRegisterAndroidViewViewOnClickListener = null;
        int registerViewModelProgressIsShownViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelPassword = null;
        java.lang.String registerViewModelFirstNameErrorGet = null;
        java.lang.String registerViewModelEmailGet = null;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelFirstName = null;
        androidx.databinding.ObservableField<java.lang.String> registerViewModelEmailError = null;
        java.lang.String registerViewModelEmailErrorGet = null;
        java.lang.Boolean registerViewModelProgressIsShownGet = null;
        java.lang.String registerViewModelLastNameGet = null;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.lastName
                        registerViewModelLastName = registerViewModel.lastName;
                    }
                    updateRegistration(0, registerViewModelLastName);


                    if (registerViewModelLastName != null) {
                        // read registerViewModel.lastName.get()
                        registerViewModelLastNameGet = registerViewModelLastName.get();
                    }
            }
            if ((dirtyFlags & 0x602L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.passwordError
                        registerViewModelPasswordError = registerViewModel.passwordError;
                    }
                    updateRegistration(1, registerViewModelPasswordError);


                    if (registerViewModelPasswordError != null) {
                        // read registerViewModel.passwordError.get()
                        registerViewModelPasswordErrorGet = registerViewModelPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.email
                        registerViewModelEmail = registerViewModel.email;
                    }
                    updateRegistration(2, registerViewModelEmail);


                    if (registerViewModelEmail != null) {
                        // read registerViewModel.email.get()
                        registerViewModelEmailGet = registerViewModelEmail.get();
                    }
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.lastNameError
                        registerViewModelLastNameError = registerViewModel.lastNameError;
                    }
                    updateRegistration(3, registerViewModelLastNameError);


                    if (registerViewModelLastNameError != null) {
                        // read registerViewModel.lastNameError.get()
                        registerViewModelLastNameErrorGet = registerViewModelLastNameError.get();
                    }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.progressIsShown
                        registerViewModelProgressIsShown = registerViewModel.progressIsShown;
                    }
                    updateRegistration(4, registerViewModelProgressIsShown);


                    if (registerViewModelProgressIsShown != null) {
                        // read registerViewModel.progressIsShown.get()
                        registerViewModelProgressIsShownGet = registerViewModelProgressIsShown.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(registerViewModel.progressIsShown.get())
                    androidxDatabindingViewDataBindingSafeUnboxRegisterViewModelProgressIsShownGet = androidx.databinding.ViewDataBinding.safeUnbox(registerViewModelProgressIsShownGet);
                if((dirtyFlags & 0x610L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxRegisterViewModelProgressIsShownGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(registerViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
                    registerViewModelProgressIsShownViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxRegisterViewModelProgressIsShownGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x620L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.firstNameError
                        registerViewModelFirstNameError = registerViewModel.firstNameError;
                    }
                    updateRegistration(5, registerViewModelFirstNameError);


                    if (registerViewModelFirstNameError != null) {
                        // read registerViewModel.firstNameError.get()
                        registerViewModelFirstNameErrorGet = registerViewModelFirstNameError.get();
                    }
            }
            if ((dirtyFlags & 0x600L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel::attemptRegister
                        registerViewModelAttemptRegisterAndroidViewViewOnClickListener = (((mRegisterViewModelAttemptRegisterAndroidViewViewOnClickListener == null) ? (mRegisterViewModelAttemptRegisterAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mRegisterViewModelAttemptRegisterAndroidViewViewOnClickListener).setValue(registerViewModel));
                    }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.password
                        registerViewModelPassword = registerViewModel.password;
                    }
                    updateRegistration(6, registerViewModelPassword);


                    if (registerViewModelPassword != null) {
                        // read registerViewModel.password.get()
                        registerViewModelPasswordGet = registerViewModelPassword.get();
                    }
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.firstName
                        registerViewModelFirstName = registerViewModel.firstName;
                    }
                    updateRegistration(7, registerViewModelFirstName);


                    if (registerViewModelFirstName != null) {
                        // read registerViewModel.firstName.get()
                        registerViewModelFirstNameGet = registerViewModelFirstName.get();
                    }
            }
            if ((dirtyFlags & 0x700L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.emailError
                        registerViewModelEmailError = registerViewModel.emailError;
                    }
                    updateRegistration(8, registerViewModelEmailError);


                    if (registerViewModelEmailError != null) {
                        // read registerViewModel.emailError.get()
                        registerViewModelEmailErrorGet = registerViewModelEmailError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityRegisterEmail, registerViewModelEmailGet);
        }
        if ((dirtyFlags & 0x700L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityRegisterEmail, registerViewModelEmailErrorGet);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityRegisterEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityRegisterEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityRegisterFirstNameEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityRegisterFirstNameEtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityRegisterLastNameEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityRegisterLastNameEtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityRegisterPasswordEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityRegisterPasswordEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityRegisterFirstNameEt, registerViewModelFirstNameGet);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityRegisterFirstNameEt, registerViewModelFirstNameErrorGet);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityRegisterLastNameEt, registerViewModelLastNameGet);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityRegisterLastNameEt, registerViewModelLastNameErrorGet);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityRegisterPasswordEt, registerViewModelPasswordGet);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            com.example.bookreview.viewmodel.RegisterViewModel.setErrorMessage(this.activityRegisterPasswordEt, registerViewModelPasswordErrorGet);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.activityRegisterProgressBar.setVisibility(registerViewModelProgressIsShownViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            this.activityRegisterRegisterButton.setOnClickListener(registerViewModelAttemptRegisterAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.bookreview.viewmodel.RegisterViewModel value;
        public OnClickListenerImpl setValue(com.example.bookreview.viewmodel.RegisterViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.attemptRegister(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerViewModel.lastName
        flag 1 (0x2L): registerViewModel.passwordError
        flag 2 (0x3L): registerViewModel.email
        flag 3 (0x4L): registerViewModel.lastNameError
        flag 4 (0x5L): registerViewModel.progressIsShown
        flag 5 (0x6L): registerViewModel.firstNameError
        flag 6 (0x7L): registerViewModel.password
        flag 7 (0x8L): registerViewModel.firstName
        flag 8 (0x9L): registerViewModel.emailError
        flag 9 (0xaL): registerViewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(registerViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(registerViewModel.progressIsShown.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}