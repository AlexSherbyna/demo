package com.alexs.Intresting.Game_1;
import java.lang.*;

public class GameControler {
    private GameModel gameModel;


    public GameControler(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public  int chekNumber( int userNumber) {
        System.out.println(gameModel.getRandomNumber());
        return  Integer.compare(gameModel.getRandomNumber(),userNumber);

    }

}


