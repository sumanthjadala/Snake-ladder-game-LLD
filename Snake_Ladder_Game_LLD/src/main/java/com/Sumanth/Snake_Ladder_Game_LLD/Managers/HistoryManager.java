package com.Sumanth.Snake_Ladder_Game_LLD.Managers;

import com.Sumanth.Snake_Ladder_Game_LLD.Algorithms.Search;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.*;

import java.util.List;

public class HistoryManager {
    private static HistoryManager historyManager=null;
    private List<Ladder> ladderList;
    private List<Snake> snakeList;
    private HistoryManager(){

    }

    public void setLadderList(List<Ladder> ladderList) {
        this.ladderList = ladderList;
    }

    public void setSnakeList(List<Snake> snakeList) {
        this.snakeList = snakeList;
    }

    public static HistoryManager getInstance(){
        if(historyManager==null){
            historyManager=new HistoryManager();
        }
        return historyManager;
    }
    public void checkCondition(Player p, int number) {
        int cur_position=p.getPosition();
        if(cur_position+number>100){
            System.out.println("You cannot got more than 100 . so not valid move");
            return ;
        }
        p.setPosition(cur_position+number);
        p.addHistory(new History(cur_position,p.getPosition(),number,"Dice Drawn"));
        int nextLadderPosition=Search.binarySearchLadder(ladderList,p.getPosition());
        if(nextLadderPosition!=p.getPosition()){
            p.addHistory(new History(p.getPosition(),nextLadderPosition,nextLadderPosition-p.getPosition(),"Ladder"));
        }
        int nextSnakePosition=Search.binarySearchSnake(snakeList,p.getPosition());
        if(nextSnakePosition!=p.getPosition()){
            p.addHistory(new History(p.getPosition(),nextSnakePosition,nextSnakePosition-p.getPosition(),"Snake Bite"));
        }
    }
}
