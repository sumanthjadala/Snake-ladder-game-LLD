package com.Sumanth.Snake_Ladder_Game_LLD.Model;

public class History {
    private int start;
    private int end;
    private int numberOnDice;

    private String description;

    public History(int start, int end, int numberOnDice,String description) {
        this.start = start;
        this.end = end;
        this.numberOnDice = numberOnDice;
        this.description=description;
    }

    @Override
    public String toString() {
        String reason=numberOnDice<0 ? "Down" : "up";
        if(numberOnDice<0){

        }
        return "History{" +
                "CurrentPosition=" + start +
                ", ReachedPosition=" + end +
                ", "+reason+" =" + Math.abs(numberOnDice) +
                ", description=" + description+
                '}';
    }
}
