package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class SongInfo {
    @SerializedName("TITLE")
    private String title;
    @SerializedName("ARTIST")
    private String artist;
    @SerializedName("ALBUM")
    private String album;
    @SerializedName("YEAR")
    private String year;
    @SerializedName("CIRCLE")
    private String circle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
