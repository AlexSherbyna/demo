package com.alexs.Game_2;

import java.util.ArrayList;
import java.util.List;

public class Game_2_Model {

    List<Integer> arrayList = new ArrayList<>();

    private int startNumber = 100, lastNumber = 999, lastUserNumber = 0,ina = 15;

    protected void lastNumberUser(int userNumber) {

         lastUserNumber =  userNumber % 10;
    }

    protected void cycle() {
        for(; startNumber < lastNumber; startNumber++ ) {
            chek();
        }
    }

    protected void chek() {
        if(startNumber % 10 == lastUserNumber) {
            arrayList.add(startNumber);
        }
    }

}
