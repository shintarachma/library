package com.example.bookreview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Volume {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("volumeInfo")
    @Expose
    private VolumeInfo volumeInfo;


    public String getId() {
        return id;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }
}
