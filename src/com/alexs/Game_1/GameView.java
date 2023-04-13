package com.alexs.Game_1;


 enum Dialog {

     SELECT("Select your number"),
     BIG("Your number is big"),
     LOW("Your number is low"),
     WON("Yo won!");

     private final String text;

     Dialog(String text) {

         this.text = text;

     }
     public String getText() {
         return text;
     }


}
    public class GameView {
        public  void  showText(Dialog dialog) {

            System.out.println(dialog.getText());
        }
    }
