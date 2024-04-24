package com.Sumanth.Snake_Ladder_Game_LLD.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    private List<Player> players=new ArrayList<>();
    private List<Snake> snakes=new ArrayList<>();
    private List<Ladder> ladders=new ArrayList<>();
    private static Game game=null;
    private Game(){
    }
    public static  Game getInstance(){
        if(game==null){
            game=new Game();
        }
        return game;
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public List<Snake> getSnakes() {
        return snakes;
    }
    public void sortSnakes(){
        Collections.sort(this.snakes,(snake1,snake2)->{
            return snake1.getStart()-snake2.getStart();
        });
    }

    public void addSnake(Snake snake) {
        this.snakes.add(snake);
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void addLadders(Ladder ladder) {
        this.ladders.add(ladder);
    }
    public void sortLadders(){
        Collections.sort(this.ladders,(ladder1,ladder2)->{
            return ladder1.getStart()-ladder2.getStart();
        });
    }

}
