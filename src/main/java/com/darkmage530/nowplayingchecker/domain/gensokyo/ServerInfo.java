package com.darkmage530.nowplayingchecker.domain.gensokyo;

import com.google.gson.annotations.SerializedName;

public class ServerInfo {
    @SerializedName("LASTUPDATE")
    private long lastUpdate;
    @SerializedName("SERVERS")
    private int servers;
    @SerializedName("STATUS")
    private String status;
    @SerializedName("LISTENERS")
    private int listeners;
    @SerializedName("BITRATE")
    private Bitrate bitrate;
    @SerializedName("MODE")
    private String mode;
    @SerializedName("AIMS")
    private boolean aims;

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getServers() {
        return servers;
    }

    public void setServers(int servers) {
        this.servers = servers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public Bitrate getBitrate() {
        return bitrate;
    }

    public void setBitrate(Bitrate bitrate) {
        this.bitrate = bitrate;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isAims() {
        return aims;
    }

    public void setAims(boolean aims) {
        this.aims = aims;
    }
}
