package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class SongTimes {
    @SerializedName("DURATION")
    private String duration;
    @SerializedName("PLAYED")
    private int played;
    @SerializedName("REMAINING")
    private int remaining;
    @SerializedName("SONGSTART")
    private long songStart;
    @SerializedName("SONGEND")
    private long songEnd;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public long getSongStart() {
        return songStart;
    }

    public void setSongStart(long songStart) {
        this.songStart = songStart;
    }

    public long getSongEnd() {
        return songEnd;
    }

    public void setSongEnd(long songEnd) {
        this.songEnd = songEnd;
    }

}
