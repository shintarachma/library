package com.example.bookreview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumeInfo {

    private class IndustryIdentifiers {
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("identifier")
        @Expose
        private String identifier;

        public String getType() {
            return type;
        }

        public String getIdentifier() {
            return identifier;
        }
    }

    private class ImageLinks{
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;

        public String getThumbnail() {
            return thumbnail;
        }
    }

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("authors")
    @Expose
    private List<String> authors;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("publishedDate")
    @Expose
    private String publishedDate;
    @SerializedName("IndustryIdentifiers")
    @Expose
    private List<IndustryIdentifiers> industryIdentifiers;
    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("categories")
    @Expose
    private List<String> categories;
    @SerializedName("maturityRating")
    @Expose
    private String maturityRating;
    @SerializedName("imageLinks")
    @Expose
    private ImageLinks imageLinks;
    @SerializedName("previewLink")
    @Expose
    private String previewLink;
    @SerializedName("infoLink")
    @Expose
    private String infoLink;
    @SerializedName("canonicalVolumeLink")
    @Expose
    private String canonicalVolumeLink;

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public List<IndustryIdentifiers> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public String getImageLinks() {
        return imageLinks.getThumbnail();
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }
}
