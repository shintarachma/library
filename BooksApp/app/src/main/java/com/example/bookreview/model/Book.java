package com.example.bookreview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("release_year")
    @Expose
    private String release_year;
    @SerializedName("isbn")
    @Expose
    private String isbn;

    public String getId() {
        return id;
    }

    public String getCover() {
        return cover;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getRelease_year() {
        return release_year;
    }

    public String getIsbn() {
        return isbn;
    }
}
