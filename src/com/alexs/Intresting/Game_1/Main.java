package com.alexs.Intresting.Game_1;

public class Main {
    public static void main(String[] args) {
        GameModel gameModel = new GameModel();
        GameControler gameControler = new GameControler(gameModel);
        GameView gameProces = new GameView(gameControler);

        gameProces.gameStart();

    }
}


