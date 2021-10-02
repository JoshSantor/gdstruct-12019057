package com.joshsantor;

import java.util.Objects;

public class Players {
    private int playerId;
    private String userName;
    private int level;

    public Players()
    {
        //LMAO to reduced hassle
    }


    public Players(int playerId, String userName, int level) {
        this.playerId = playerId;
        this.userName = userName;
        this.level = level;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return playerId == players.playerId && level == players.level && Objects.equals(userName, players.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, level);
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerId=" + playerId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }
}
