package com.alexs.Game_3;

public class Game_3_Controler {
    private Game_3_Model  game_3_model;
    private Game_3_View game_3_view;
    private SaveText saveText;


    public Game_3_Controler(Game_3_Model game_3_model, Game_3_View game_3_view, SaveText saveText) {
        this.game_3_model = game_3_model;
        this.game_3_view = game_3_view;
        this.saveText = saveText;
    }

    protected void gameStart() {
        game_3_view.showText(Dialog.GETNUMBER);
        game_3_model.setUserNumber();
        game_3_model.checkCondition();
        saveText.saveText("D:\\Programming\\Demo\\src\\com\\alexs\\Game_3\\Resources\\Text.txt",game_3_model.stringList.toString());
        game_3_view.showList(game_3_model.stringList);
        game_3_view.showText(Dialog.END);
    }
}
