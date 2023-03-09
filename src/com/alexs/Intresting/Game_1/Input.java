package com.alexs.Intresting.Game_1;


import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    private int number;

    public void  setNumber() {
         number = scanner.nextInt();

    }

    public int getNumber() {
        return number;
    }


}
