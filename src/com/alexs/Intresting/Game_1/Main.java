package com.alexs.Intresting.Game_1;

public class Main {
    public static void main(String[] args) {
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView();

        GameControler gameControler = new GameControler(gameModel,gameView);


        gameControler.gameStart();

    }
}


