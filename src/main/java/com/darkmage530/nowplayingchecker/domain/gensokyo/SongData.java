package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class SongData {
    @SerializedName("SONGID")
    private String songId;
    @SerializedName("ALBUMID")
    private String albumId;
    @SerializedName("RATING")
    private String rating;
    @SerializedName("TIMESRATED")
    private int timesRated;

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getTimesRated() {
        return timesRated;
    }

    public void setTimesRated(int timesRated) {
        this.timesRated = timesRated;
    }
}
