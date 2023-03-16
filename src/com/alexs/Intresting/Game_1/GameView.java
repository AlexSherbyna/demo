package com.alexs.Intresting.Game_1;

import java.util.Scanner;

public class GameView {
    Scanner scanner = new Scanner(System.in);

    private boolean run = true;
    private GameControler gameControler;
    private int number;
    private int result;

    public GameView(GameControler gameControler) {
        this.gameControler = gameControler;
    }

    public void gameStart() {

        System.out.println("Select your number");
        number = scanner.nextInt();
        result = gameControler.chekNumber(number);

        while (run) {
            if (result != 0) {
                if (result != 1) {
                    System.out.println(("Your number is big"));
                } else {
                    System.out.println(("Your number is low"));
                }
                number = scanner.nextInt();
                result = gameControler.chekNumber(number);
            } else {
                System.out.println("Yo won!");
                run = false;
            }
        }
    }

}
