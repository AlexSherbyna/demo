package com.alexs.Game_1;
import java.lang.*;
import java.util.Scanner;

public class GameControler {

    private GameModel gameModel;
    private GameView gameView;
    private boolean run = true;
    private int number;
    private int result;



    public GameControler(GameModel gameModel ,GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    public void gameStart() {
        Scanner scanner = new Scanner(System.in);

        gameView.showText(Dialog.SELECT);
        number = scanner.nextInt();
        result = gameModel.chekNumber(number);

        while (run) {
            if (result != 0) {
                if (result != 1) {
                    gameView.showText(Dialog.BIG);
                } else {
                   gameView.showText(Dialog.LOW);
                }
                number = scanner.nextInt();
                result = gameModel.chekNumber(number);
            } else {
                gameView.showText(Dialog.WON);
                run = false;
            }
        }
    }



}


