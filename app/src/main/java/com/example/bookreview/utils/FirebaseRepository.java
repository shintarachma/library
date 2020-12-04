package com.example.bookreview.utils;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.bookreview.view.activity.LoginActivity;
import com.example.bookreview.view.activity.MainActivity;
import com.example.bookreview.view.activity.PreLoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.example.bookreview.R;
import com.example.bookreview.model.User;

import java.util.HashMap;
import java.util.Map;

import static androidx.constraintlayout.widget.Constraints.TAG;
import static com.example.bookreview.utils.Constants.LOG_TAG;
import static com.example.bookreview.utils.Constants.USERS;

/**
 * Firebase repository class contains all Firebase related codes as the data access layer.
 */
public class FirebaseRepository {

    // Singleton pattern field
    private static FirebaseRepository sInstance;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private FirebaseFirestore mStore;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    /**
     * Singleton pattern to return an instance of Firebase Repository.
     *
     * @return FirebaseRepository instance
     */
    public static synchronized FirebaseRepository getInstance() {
        if (sInstance == null) {
            sInstance = new FirebaseRepository();
        }
        return sInstance;
    }

    /**
     * Empty constructor
     */
    private FirebaseRepository() {
    }

    /**
     * Get the current user database reference.
     *
     * @param uid user key
     * @return database reference
     */
    private DatabaseReference getCurrentUserDatabaseReference(String uid) {
        return FirebaseDatabase.getInstance().getReference().child(USERS).child(uid);
    }

    /**
     * Get the current user storage reference.
     *
     * @param uid user key
     * @return storage reference
     */
    private StorageReference getCurrentUserStorageReference(String uid) {
        return FirebaseStorage.getInstance().getReference().child(USERS).child(uid);
    }


    /**
     * Attempt registration to Firebase.
     *
     * @param email       user email
     * @param password    user password
     * @param firstName   user first name
     * @param lastName    user last name
     * @param application application
     */
    public void register(final String email, final String password, final String firstName, final String lastName, final Application application) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Create user authentication success
                            Log.d(LOG_TAG, "createUserWithEmail:success");

                            // Create new User object
                            String uid = mAuth.getCurrentUser().getUid();
                            User newUser = new User(email,password,firstName,lastName);

                            DatabaseReference userNode = database.getReference();
                            userNode.child(uid).setValue(newUser);

                            // Add the new user to Database
//                            DocumentReference documentReference = mStore.collection("users").document(uid);
//                            Map<String,Object> user = new HashMap<>();
//                            user.put("fName",firstName);
//                            user.put("lName",lastName);
//                            user.put("email",email);
//                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
//                                @Override
//                                public void onSuccess(Void aVoid) {
//                                    Log.d(TAG, "onSuccess: user Profile is created");
//                                }
//                            }).addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//                                    Log.d(TAG, "onFailure: " + e.toString());
//                                }
//                            });
//                            addUserToDatabase(uid, newUser, application);

                            Toast.makeText(application.getApplicationContext(), R.string.registration_successful,
                                    Toast.LENGTH_SHORT).show();

                            Intent loginIntent = new Intent(application.getApplicationContext(), PreLoginActivity.class);
                            application.startActivity(loginIntent);

                        } else {
                            // If registration fails, display a message to the user.
                            Log.d(LOG_TAG, "createUserWithEmail:failure", task.getException());

                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                Toast.makeText(application.getApplicationContext(), R.string.email_already_exists,
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(application.getApplicationContext(), task.getException().getMessage(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
    }

//    /**
//     * Add the user to Firabase Database.
//     *
//     * @param uid         user key
//     * @param newUser     user object
//     * @param application application
//     */
//    private void addUserToDatabase(String uid, User newUser, final Application application) {
//        getCurrentUserDatabaseReference(uid).setValue(newUser).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Log.d(LOG_TAG, "addUserToDatabase:success");
//
//                    // Add user to database successful, start navigation activity
////                    Intent navigationIntent = new Intent(application.getApplicationContext(), MainActivity.class);
////                    navigationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
////                    application.startActivity(navigationIntent);
//                } else {
//                    Log.d(LOG_TAG, "addUserToDatabase:failure", task.getException());
//                }
//            }
//        });
//    }

}
