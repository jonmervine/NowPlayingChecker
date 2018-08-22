package com.darkmage530.nowplayingchecker.domain;

import com.darkmage530.nowplayingchecker.domain.gensokyo.*;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GensokyoRadioApi implements Serializable {
    @SerializedName("SERVERINFO")
    private ServerInfo serverInfo;
    @SerializedName("SONGINFO")
    private SongInfo songInfo;
    @SerializedName("SONGTIMES")
    private SongTimes songTimes;
    @SerializedName("SONGDATA")
    private SongData songData;
    @SerializedName("MISC")
    private Misc misc;

    public SongTimes getSongTimes() {
        return songTimes;
    }

    public void setSongTimes(SongTimes songTimes) {
        this.songTimes = songTimes;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public SongInfo getSongInfo() {
        return songInfo;
    }

    public void setSongInfo(SongInfo songInfo) {
        this.songInfo = songInfo;
    }



    public SongData getSongData() {
        return songData;
    }

    public void setSongData(SongData songData) {
        this.songData = songData;
    }

    public Misc getMisc() {
        return misc;
    }

    public void setMisc(Misc misc) {
        this.misc = misc;
    }
}
