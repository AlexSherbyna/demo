package com.alexs.Game_2;
import java.util.Scanner;

public class Game_2_Controler {

    Scanner scanner = new Scanner(System.in);

    private Game_2_Model gameModel;
    private Game_2_View gameView;
    private int userNumber;

    public  Game_2_Controler (Game_2_Model game_2_model, Game_2_View game_2_view) {
        this.gameModel = game_2_model;
        this.gameView = game_2_view;
    }

    protected void gameStart() {

        gameView.showText(Dialog.SELECT);

        userNumber = scanner.nextInt();

        gameModel.lastNumberUser(userNumber);
        gameModel.cycle();
        gameView.showText(Dialog.START);
        gameView.showList(gameModel.arrayList);
        gameView.showText(Dialog.END);



    }
}
