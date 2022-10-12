package com.alexs;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.out;

public class GameMagicNumber {

    private Integer randomNumber, randomNumber_1, randomNumber_2 ;
    private Integer maxNumber = 0;
    private Integer minNumber = 0;
    private Integer sameNumber = 0;
    private Integer[] arr_1 = new Integer[2];
    private Integer[] arr_2 = new Integer[2];
    private Integer arr[] = new Integer[2];
    private final String MAX_NUMBER = "Max number";
    private final String MIN_NUMBER = "Min number";
    private final String SAME_NUMBER = "Same number";

   private Integer randomNumberGenerate() {
       randomNumber = (int)(Math.random() * (77- 1) + 17);
       return randomNumber;
   }

   public void start() {
        randomNumber_1 = randomNumberGenerate();
        randomNumber_2 = randomNumberGenerate();

       chekNumber(randomNumber_1);
       outText(randomNumber_1);
       arr_1 = arr;
       numberDown();

       chekNumber(randomNumber_2);
       outText(randomNumber_2);
       arr_2 = arr;
       arrSort(arr_1, arr_2);
       bigOrNot(randomNumber_1, randomNumber_2);
       outText(minNumber, maxNumber);
       numberDown();

   }

   private void chekNumber(Integer number) {
       randomNumber = number;
       arr[0] = randomNumber /10;
       arr[1] = randomNumber %10;
       Arrays.sort(arr);
       minNumber = arr[0];
       maxNumber = arr[1];

       if(arr[0] == arr[1])
           sameNumber = arr[0];
   }
   private void arrSort(Integer arrOne[], Integer arrTwo[]) {

       if (arrOne[0] > arrTwo[0]) {
           minNumber = arrTwo[0];
       } else {
           minNumber = arrTwo[0];
       }
       if (arrOne[1] > arrTwo[1]) {
           maxNumber = arrTwo[1];
       } else {
           maxNumber = arrTwo[1];
       }
   }

   private void bigOrNot(Integer num_1, Integer num_2) {
       if(num_1 > num_2){
           out.println(num_1 +" "+"Big");
       }else {
           out.println(num_2 +" "+"Big");
       }
   }
   private void numberDown() {
       maxNumber = 0;
       minNumber = 0;
       sameNumber = 0;
   }

   private void outText(Integer outNumber ) {

       out.println(outNumber+" "+"Random number");
       out.println(maxNumber+" "+MAX_NUMBER);
       out.println(minNumber+" "+MIN_NUMBER);
       out.println(sameNumber+" "+SAME_NUMBER);

   }
   private void outText(Integer minNumber, Integer maxNumber ) {
       out.println( "Small number"+ " " +minNumber);
       out.println( "Max number"+ " " +maxNumber);


   }

}


