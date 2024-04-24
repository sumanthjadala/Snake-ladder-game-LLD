package com.Sumanth.Snake_Ladder_Game_LLD.Algorithms;

import java.util.Random;

public class RandomNumberGenerator {
    public static int drawTheDice(){
        Random random=new Random();
        return random.nextInt(1,7);
    }
}
