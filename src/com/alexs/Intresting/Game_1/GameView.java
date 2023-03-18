package com.alexs.Intresting.Game_1;


 enum Dialog {

     SELECT("Select your number"),
     BIG("Your number is big"),
     LOW("Your number is low"),
     WON("Yo won!");

     private final String text;

     Dialog(String text) {
          this.text = text;
     }


}
    public class GameView {
        public Dialog showText(Dialog dialog) {
             return dialog;
        }
    }
