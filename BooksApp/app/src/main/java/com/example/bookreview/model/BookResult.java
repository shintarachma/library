package com.example.bookreview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookResult {
    @SerializedName("books")
    @Expose
    private List<Book> books = null;

    public List<Book> getBooks() {
        return books;
    }
}
