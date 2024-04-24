package com.Sumanth.Snake_Ladder_Game_LLD.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private int position=0;
    private boolean isWin=false;
    private List<History> histories=new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public boolean isWin() {
        return isWin;
    }
    public void setWin() {
        isWin = true;
    }
    public List<History> getHistories() {
        return histories;
    }
    public void addHistory(History history) {
        this.histories.add(history);
    }


}
