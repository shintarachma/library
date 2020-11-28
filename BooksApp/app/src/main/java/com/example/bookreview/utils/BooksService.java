package com.example.bookreview.utils;

import com.example.bookreview.model.BookResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BooksService {
    @GET("books")
    Call<BookResult> getBooks();
}
