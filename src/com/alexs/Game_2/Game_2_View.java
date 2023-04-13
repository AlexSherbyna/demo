package com.alexs.Game_2;

import java.util.List;

enum Dialog {

            SELECT("Select your number"),
            START("Start"),
            END("END");

            private final String text;

            Dialog(String text) {

                this.text = text;

            }
            protected String getText() {
                return text;
            }
        }

        public class Game_2_View {
            protected void showText(Dialog dialog) {

                System.out.print(dialog.getText() +" ");
            }

            protected void showList(List<Integer> list) {

               list.forEach((n)->System.out.print(n +" "));
            }
        }


