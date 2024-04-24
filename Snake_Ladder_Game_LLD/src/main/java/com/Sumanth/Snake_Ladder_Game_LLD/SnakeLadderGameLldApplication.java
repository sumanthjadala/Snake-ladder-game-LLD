package com.Sumanth.Snake_Ladder_Game_LLD;

import com.Sumanth.Snake_Ladder_Game_LLD.Managers.GameManager;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Game;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Ladder;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Player;
import com.Sumanth.Snake_Ladder_Game_LLD.Model.Snake;

import java.util.Random;

public class SnakeLadderGameLldApplication {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake-Ladder Game");
		Game game= Game.getInstance();
		for(int i=1;i<=4;i++){
			game.addPlayer(new Player("Player "+i));
		}
		game.addLadders(new Ladder(1,20,38));
		game.addLadders((new Ladder(2,36,66)));
		game.addLadders(new Ladder(3,76,93));
		game.addSnake(new Snake(1,30,7));
		game.addSnake(new Snake(2,60,12));
		game.addSnake(new Snake(3,72,39));
		game.sortLadders();
		game.sortSnakes();
		GameManager gameManager=new GameManager(game);
		gameManager.start();
	}

}
