package com.alexs.Intresting.Game_1;

public class GameProces {

    private boolean run = true;
    RandonNumber random = new RandonNumber();
    Input input = new Input();

    public void gameStart() {
        random.getRandomNumber();

        System.out.println("Select your number");

        while (run) {
            input.setNumber();
            chekNumber(input.getNumber());

        }
    }
    private void chekNumber(int userNumber ) {

            if (userNumber != random.getRandomNumber()) {
                if (userNumber > random.getRandomNumber()) {
                    System.out.println(("Your number is big"));
                } else {
                    System.out.println(("Your number is low"));
                }
            } else {
                System.out.println("Yo won!");
                run = false;
            }
    }
}
