package com.alexs;

import java.util.Scanner;

public class Fors {

    Integer firstNumber,secondNumber, randomNumber;
    Scanner scanner = new Scanner(System.in);

    Fors(){

        System.out.println("first number");
        firstNumber = scanner.nextInt();

        System.out.println("second number");
        secondNumber = scanner.nextInt();

        for (int i = 0; i < 15;i++) {

            System.out.print(randomNumber() +addSumvol(chekNegativNunmber(randomNumber)));
            System.out.print(" ");
        }
    }

    private Integer randomNumber() {

        chekAbsNumbers(firstNumber,secondNumber);
        randomNumber = firstNumber + (int) ((secondNumber - firstNumber + 1)*Math.random()) ;
        return randomNumber;
    }

    private void chekAbsNumbers(Integer firstNumber,Integer secondNumber) {

        Integer helpNumber;

        if (firstNumber > secondNumber) {
            helpNumber = secondNumber;
            this.secondNumber = firstNumber;
            this.firstNumber = helpNumber;
        }
    }

    private boolean chekNegativNunmber(Integer isChekNumber) {
        if(isChekNumber < 0) {
           return true;
        } else {
          return   false;
        }

    }

    private String addSumvol(Boolean isAddSumvol) {
        if(isAddSumvol) return "?";
        return "";
    }

}
