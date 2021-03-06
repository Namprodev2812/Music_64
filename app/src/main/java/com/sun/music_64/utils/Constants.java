package com.sun.music_64.utils;

import com.sun.music_64.BuildConfig;

public class Constants {
    public static final String BASE_GENRE_URL
            = "https://api-v2.soundcloud.com/charts?kind=%s&genre=%s&client_id=%s&limit=%d&offset=%d";
    public static final String BASE_SEARCH_URL
            = "http://api.soundcloud.com/tracks?q=%s&client_id=%s";
    public static final String BASE_DOWNLOAD_URL
            = "https://api.soundcloud.com/tracks/%d/download?client_id=%s";
    public static final String BASE_STREAM_URL
            = "https://api.soundcloud.com/tracks/%d/stream?client_id=%s";
    public static final String KIND_TREND = "trend";
    public static final String GENRES_ALL_MUSIC = "soundcloud:genres:all-music";
    public static final String GENRES_ALL_AUDIO = "soundcloud:genres:all-audio";
    public static final String GENRES_ROCK = "soundcloud:genres:alternativerock";
    public static final String GENRES_AMBIENT = "soundcloud:genres:ambient";
    public static final String GENRES_CLASSICAL = "soundcloud:genres:classical";
    public static final String GENRES_COUNTRY = "soundcloud:genres:country";
    public static final String CLIENT_ID = BuildConfig.CLIENT_ID;
}
