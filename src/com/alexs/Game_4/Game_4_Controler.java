package com.alexs.Game_4;

import java.io.IOException;

public class Game_4_Controler {
    private Game_4_Model game_4_model;
    private Game_4_View game_4_view;

    protected Game_4_Controler(Game_4_Model game_4_model, Game_4_View game_4_view) {
        this.game_4_model = game_4_model;
        this.game_4_view = game_4_view;
    }

    protected void gameStart() throws IOException {
        game_4_view.showText("userName");
        game_4_model.setUserName();

        game_4_view.showText("number");
        game_4_model.setUserNumber();
        game_4_model.closeScanner();


        game_4_model.generateNumbers();
        game_4_view.showNumberList(game_4_model.listNumbers);
        game_4_model.saveUserData();
        game_4_view.showText("gameEnd");
        game_4_view.closeReader();


        int[]mas =new int[4];
        System.out.println(mas.length);

    }
}
