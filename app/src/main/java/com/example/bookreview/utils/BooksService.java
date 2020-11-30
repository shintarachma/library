package com.example.bookreview.utils;

import com.example.bookreview.model.BookResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BooksService {
    @GET("volumes")
    Call<BookResponse> getBooks(@Query("q") String query, @Query("maxResults") Integer maxResults);
}
