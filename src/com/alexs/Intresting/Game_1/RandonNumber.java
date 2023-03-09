package com.alexs.Intresting.Game_1;

public class RandonNumber {

    private int randomNumber;

    private int min = 0;
    private int max = 10;

    RandonNumber() {
        randomNumber = randomNumberGenerate(min,max);
    }

    private int randomNumberGenerate(int min, int max) {
        return  min + (int)((max - min +1)* Math.random());
    }

    public int getRandomNumber() {
        return randomNumber;

    }



}
