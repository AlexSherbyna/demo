package com.alexs;

public class GameMagicNumber {

    private Double randomNumber, randomNumber_1, randomNumber_2, randomNumber_3, randomNumber_4 ;
    private Double max, min;

   private Double randomNumberGenerate() {
       randomNumber = (Math.random() * 899) + 100;

       return Math.ceil(randomNumber);
   }

   public void start() {
        randomNumber_1 = randomNumberGenerate();
        randomNumber_2 = randomNumberGenerate();
        randomNumber_3 = randomNumberGenerate();
        maxMin(randomNumber_1, randomNumber_2, randomNumber_3);

        text(randomNumber_1,"A","");
        text(randomNumber_2,"B","");
        text(randomNumber_3, "C","");
        text(max,"Max", "");
        text(min, "Min", "");
        text((max - min),"Raznica", "");




   }
   private void maxMin (Double num1, Double num2, Double num3) {

       max = Math.max(randomNumber_1, randomNumber_2);
       max = Math.max(max, randomNumber_3);

       min = Math.min(randomNumber_1, randomNumber_2);
       min = Math.min(min, randomNumber_3);
   }

   private void   text (Double number , String catet, String text) {
       System.out.println(text +catet +" = " +number );

   }





}


