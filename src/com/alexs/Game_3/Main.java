package com.alexs.Game_3;

public class Main {
    public static void main(String[] args) {

        Game_3_Model game_3_model = new Game_3_Model();
        Game_3_View game_3_view = new Game_3_View();
        SaveTextToFile saveTextToFile = new SaveTextToFile(game_3_model, game_3_view);

        Game_3_Controler game_3_controler = new Game_3_Controler(game_3_model, game_3_view, saveTextToFile);
        game_3_controler.gameStart();

       }

}
