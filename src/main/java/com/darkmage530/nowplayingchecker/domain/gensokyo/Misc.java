package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class Misc {
    @SerializedName("CIRCLELINK")
    private String circleLink;
    @SerializedName("ALBUMART")
    private String albumArt;
    @SerializedName("CIRCLEART")
    private String circleArt;
    @SerializedName("OFFSET")
    private String offset;
    @SerializedName("OFFSETTIME")
    private long offsetTime;

    public String getCircleLink() {
        return circleLink;
    }

    public void setCircleLink(String circleLink) {
        this.circleLink = circleLink;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

    public String getCircleArt() {
        return circleArt;
    }

    public void setCircleArt(String circleArt) {
        this.circleArt = circleArt;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public long getOffsetTime() {
        return offsetTime;
    }

    public void setOffsetTime(long offsetTime) {
        this.offsetTime = offsetTime;
    }
}
