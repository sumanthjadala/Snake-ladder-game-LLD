package com.Sumanth.Snake_Ladder_Game_LLD.Managers;

import com.Sumanth.Snake_Ladder_Game_LLD.Algorithms.RandomNumberGenerator;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Game;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Player;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private Game game;
    private HistoryManager historyManager=HistoryManager.getInstance();
    private Scanner sc=new Scanner(System.in);
    public GameManager(Game game){
        this.game=game;
    }
    public  void start(){
        List<Player> playerList=game.getPlayers();
        historyManager.setLadderList(game.getLadders());
        historyManager.setSnakeList(game.getSnakes());
        boolean isFinish=false;
        while(!isFinish){
            for(Player p:playerList){
                System.out.println(p.getPlayerName()+ " your turn , please enter your dice drawn number (from 1 to 6) ");
                int number= sc.nextInt();
                sc.nextLine();
//                System.out.println(number);
                historyManager.checkCondition(p,number);
                if(p.getPosition()==100){
                    isFinish=true;
                }
                if(isFinish){
                    break;
                }
            }
        }
        winningOrder(playerList);

    }

    private void winningOrder(List<Player> playerList) {
        Collections.sort(playerList,(player1,player2)->{
            return player2.getPosition()-player1.getPosition();
        });
        int i=1;
        System.out.println("Winning order of the player");
        for(Player p:playerList){
            System.out.println(i+++"  "+p.getPlayerName());
        }
    }

}
