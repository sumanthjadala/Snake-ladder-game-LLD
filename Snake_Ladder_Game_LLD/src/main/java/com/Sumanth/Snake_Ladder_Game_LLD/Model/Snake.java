package com.Sumanth.Snake_Ladder_Game_LLD.Model;

public class Snake {
    private int id;
    private int start;
    private int end;

    public int getId() {
        return id;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Snake(int id, int start, int end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }
}
