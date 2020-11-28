package com.example.bookreview.utils;


/**
 * Constants class provides all string data
 */
public class Constants {

    // Debug log tag
    public static final String LOG_TAG = "LOG_TAG";

    // Request codes
    public static final int REQUEST_IMAGE_CAPTURE = 1001;
    public static final int REQUEST_LOCATION_PERMISSION = 1002;
    public static final int REQUEST_CALL_PHONE = 1003;
    public static final int REQUEST_CAMERA = 1004;

    // Authentication constants
    public static final String REGEX_NAME = "[A-Z][a-zA-Z]*";
    public static final String TYPE_IMAGE = "image/*";

    // Firebase constants
    public static final String USERS = "users";
    public static final String PROFILE_IMAGE = "profileImage";

    // Url constants
    public static final String PHOTO_BASE_URL = "https://maps.googleapis.com/maps/api/place/photo?";
    public static final String PHOTO_MAX_WIDTH = "maxwidth=400";
    public static final String PHOTO_REFERENCE_URL = "&photoreference=";
    public static final String PHOTO_KEY = "&key=";

}
