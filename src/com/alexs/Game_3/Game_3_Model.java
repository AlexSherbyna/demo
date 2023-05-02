package com.alexs.Game_3;

import java.util.*;

public class Game_3_Model {

    List<Integer> arrayList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();

    private int userNumber;

    protected void setUserNumber() {
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        scanner.close();
    }

    public int getUserNumber() {
        return userNumber;
    }

    protected void checkCondition() {
        generateNumber();

        for (int i: arrayList) {
            if(userNumber > ((i%10) + (i/10))) {
                stringList.add(String.valueOf(i));
            }
        }
    }

    protected void generateNumber() {
        for (int i = 10; i < 100; i++) {
           arrayList.add(i);
        }
    }



}
