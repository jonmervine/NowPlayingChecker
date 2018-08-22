package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class Bitrate {
    @SerializedName("BITRATE_1")
    private int bitrate_1;

    public int getBitrate_1() {
        return bitrate_1;
    }

    public void setBitrate_1(int bitrate_1) {
        this.bitrate_1 = bitrate_1;
    }
}
