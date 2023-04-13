package com.alexs.Game_2;

public class Main {
    public static void main(String[] args) {
        Game_2_Model game_2_model = new  Game_2_Model();
        Game_2_View game_2_view = new Game_2_View();

        Game_2_Controler game_2_controler = new Game_2_Controler(game_2_model, game_2_view);
        game_2_controler.gameStart();


    }
}
