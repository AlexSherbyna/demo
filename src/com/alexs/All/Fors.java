package com.alexs.All;

import java.util.ArrayList;
import java.util.Collections;

public class Fors extends  myClass {

    Integer  randomNumber, numberValue = 10, minNumber = 100, maxNumber = 999;
    ArrayList<Integer> arrayListNumbers = new ArrayList<>();

    Fors(){


        addNumbersToArray();
        Collections.sort(arrayListNumbers);
        System.out.print("START ");

        for (int numbers : arrayListNumbers) {
            checkLastNumberSeven(numbers);
            System.out.print(" ");
        }
        System.out.print("FINISH");
    }

    private Integer randomNumber() {
        randomNumber = minNumber + (int) ((maxNumber - minNumber + 1)*Math.random()) ;
        return randomNumber;
    }

    private void addNumbersToArray() {

        for (int i = 0; i < numberValue; i++) {
            arrayListNumbers.add(i,randomNumber());
        }
    }

    private void checkLastNumberSeven(Integer isNumber) {
        if(isNumber % 10 == 7) {
            System.out.print(isNumber +" ");
        }
    }

}
