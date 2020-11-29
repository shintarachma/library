package com.example.bookreview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookResponse {

    @SerializedName("items")
    @Expose
    private List<Volume> volumes = null;
    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;

    public List<Volume> getVolumes() {
        return volumes;
    }

    public Integer getTotalItems() {
        return totalItems;
    }
}
