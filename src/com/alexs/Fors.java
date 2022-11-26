package com.alexs;

import java.util.Scanner;

public class Fors {
    Scanner scanner = new Scanner(System.in);
    Fors(){
        Integer a1,a2;
        System.out.println("first number");
        a1 = scanner.nextInt();

        System.out.println("second number");
        a2 = scanner.nextInt();

        for (int i = 0; i < 20;i++) {

            System.out.println(randomNumber(a1,a2));
        }

    }

    private void startFors() {

    }
    private Integer randomNumber(Integer firstNumber,Integer secondNumber) {
        Integer randomNumber,helpNumber;
        if (firstNumber > secondNumber) {
            helpNumber = secondNumber;
            secondNumber = firstNumber;
            firstNumber = helpNumber;
        }
        randomNumber = firstNumber + (int) ((secondNumber - firstNumber + 1)*Math.random()) ;
        return randomNumber;
    }
    private void generation() {
        for (int i = 0; i < 20;i++) {

        }
    }

}
