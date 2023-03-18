package com.alexs.Intresting.Game_1;

public class GameModel {

    private int min = 0;
    private int max = 10;
    private int randomNumber;

    public GameModel() {
        randomNumberGenerate(min,max);
    }

    private  void randomNumberGenerate(int min, int max) {

        randomNumber =  min + (int)((max - min +1)* Math.random());

    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public  int chekNumber( int userNumber) {
        System.out.println(getRandomNumber());// проверка
        return  Integer.compare(getRandomNumber(),userNumber);
    }

}
