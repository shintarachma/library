package com.example.bookreview.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bookreview.R;
import com.example.bookreview.model.User;
import com.example.bookreview.utils.Constants;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import static com.example.bookreview.utils.Constants.LOG_TAG;

public class ProfileFragment extends Fragment {

    private DatabaseReference mDatabaseRef;
    private FirebaseUser mUser;
    private Button signOut;
    private TextView mName;
    private TextView mEmail;
    private ImageView mProfileImg;

    private OnFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ProfileFragment() {
    }

    /**
     * Create new instance of the profile fragment
     *
     * @return ProfileFragment instance
     */
    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    /**
     * Called when activity is first created.
     *
     * @param savedInstanceState Bundle object containing the activity's previously saved state
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Inflate the view of the fragment
     *
     * @param inflater           layout inflater
     * @param container          viewgroup container
     * @param savedInstanceState Bundle object containing the activity's previously saved state
     * @return the inflated view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile, container, false);
    }

    /**
     * Called after the view is created
     *
     * @param view               the view
     * @param savedInstanceState bundle object
     */
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mName = (TextView) getView().findViewById(R.id.fragment_profile_name);
        mEmail = (TextView) getView().findViewById(R.id.fragment_profile_email);
        mProfileImg = (ImageView) getView().findViewById(R.id.fragment_profile_image);

        // Get the user data from database
        mUser = FirebaseAuth.getInstance().getCurrentUser();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference().child(Constants.USERS).child(mUser.getUid());

        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                mName.setText(getString(R.string.full_name, user.firstName, user.lastName));
                mEmail.setText(user.email);
                if (!user.profileImage.isEmpty()) {
                    // Load profile image
                    Picasso.get().load(user.profileImage).placeholder(R.drawable.ic_baseline_account_box_24).into(mProfileImg);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Failed to read value
                Log.d(LOG_TAG, "Failed to read value.", databaseError.toException());
            }
        });

    }

    public void signOut() {
        FirebaseAuth.getInstance().signOut();
        Log.d(LOG_TAG, "User is signed out");
    }

    /**
     * Called when the navigation button is pressed.
     *
     * @param uri unique identifier
     */
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /**
     * Attach the onFragmentInteractionListener.
     *
     * @param context the context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + getString(R.string.must_implement_on_fragment_interaction_listener));
        }
    }

    /**
     * Detach the listener.
     */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that activity.
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
