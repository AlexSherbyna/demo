package com.alexs.Game_3;

import java.util.List;

enum Dialog {
        GETNUMBER("Select your number"),
        USERNUMBER("User number"),
        END("END");

        private final String text;

        Dialog(String text) {

            this.text = text;
        }

        protected String getText() {
            return text;
        }
    }

public class Game_3_View {

    protected void showText(com.alexs.Game_3.Dialog dialog) {
        System.out.println(dialog.getText() +" ");

    }
    protected void showList(List<String> list) {
        list.forEach((n)-> System.out.print(n +" "));
    }

    protected String saveTextToFile(Dialog dialog) {
        return dialog.getText();
    }

}
