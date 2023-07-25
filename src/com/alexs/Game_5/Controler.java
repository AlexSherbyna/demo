package com.alexs.Game_5;

public class Controler {
   private Model model;
   private View view;

   protected Controler (Model model,View view) {
       this.model = model;
       this.view = view;
    }

    protected void gameStart() {
       model.countStartProgram();
       view.showText("Hi! get me your number");
       model.setUserNumber();
       model.generateNumbers();
       view.showText("OK, goodbye");


    }
}
