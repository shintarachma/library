package com.example.bookreview.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreview.R;
import com.example.bookreview.model.BookResponse;
import com.example.bookreview.model.BooksAdapter;
import com.example.bookreview.model.Volume;
import com.example.bookreview.utils.APIClient;
import com.example.bookreview.utils.BooksService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private RecyclerView rvBookList;
    private TextView tvTitle;
    private ImageView ivThumbnail;
    private BooksAdapter aBookAdapter;
    private List<Volume> bookList;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public HomeFragment() {
    }

    /**
     * Create new instance of the profile fragment
     *
     * @return SearchFragment instance
     */
    public static HomeFragment newInstance() {
        return new HomeFragment();
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
        return inflater.inflate(R.layout.activity_main, container, false);
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
        rvBookList = (RecyclerView) view.findViewById(R.id.rv_book_list);
        getBookList();
    }

    public void getBookList() {
        Retrofit retrofit = APIClient.getRetrofit();
        BooksService service = retrofit.create(BooksService.class);
        Call<BookResponse> call = service.getBooks("computer", 40);

        call.enqueue(new Callback<BookResponse>() {
            @Override
            public void onResponse(Call<BookResponse> call, Response<BookResponse> response) {
                bookList = response.body().getVolumes();

                aBookAdapter = new BooksAdapter(bookList);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeFragment.this.getContext());
                rvBookList.setLayoutManager(layoutManager);
                rvBookList.setAdapter(aBookAdapter);
            }

            @Override
            public void onFailure(Call<BookResponse> call, Throwable t) {
                call.cancel();
            }
        });
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
        if (context instanceof HomeFragment.OnFragmentInteractionListener) {
            mListener = (HomeFragment.OnFragmentInteractionListener) context;
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
