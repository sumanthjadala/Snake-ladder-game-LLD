package com.Sumanth.Snake_Ladder_Game_LLD.Algorithms;

import com.Sumanth.Snake_Ladder_Game_LLD.Model.Ladder;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Snake;

import java.util.List;

public class Search{
    public static int binarySearchLadder(List<Ladder> ladderList, int searchElement){
        int left=0;
        int right=ladderList.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            Ladder midSnake=ladderList.get(mid);
            if(midSnake.getStart()==searchElement){
                return midSnake.getEnd();
            }else if(midSnake.getStart()>searchElement){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return searchElement;
    }
    public static int binarySearchSnake(List<Snake> snakeList, int searchElement){
        int left=0;
        int right=snakeList.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            Snake midSnake=snakeList.get(mid);
            if(midSnake.getStart()==searchElement){
                return midSnake.getEnd();
            }else if(midSnake.getStart()>searchElement){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return searchElement;
    }
}
