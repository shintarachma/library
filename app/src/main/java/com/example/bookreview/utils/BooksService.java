package com.example.bookreview.utils;

import com.example.bookreview.model.BookResponse;
import com.example.bookreview.model.Volume;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BooksService {
    @GET("volumes")
    Call<BookResponse> getBooks(@Query("q") String query, @Query("maxResults") Integer maxResults);

    @GET("volumes/{id}")
    Call<Volume> getVolume(@Path("id") String volumeId);
}
