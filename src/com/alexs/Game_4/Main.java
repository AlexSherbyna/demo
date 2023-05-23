package com.alexs.Game_4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
     public static void main(String[] args) throws IOException {
          Game_4_Model game_4_model = new Game_4_Model();
          Game_4_View game_4_view = new Game_4_View();
          Game_4_Controler game_4_controler = new Game_4_Controler(game_4_model,game_4_view);
          game_4_controler.gameStart();
     }

}
