package com.alexs.Game_5;

public class Main {
    public static void main(String[] args)  {
        Model model = new Model();
        View view = new View();
        Controler controler = new Controler(model, view);

        controler.gameStart();

    }
}