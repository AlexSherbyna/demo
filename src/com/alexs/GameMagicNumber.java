package com.alexs;

public class GameMagicNumber {

    private Double randomNumber, randomNumber_1, randomNumber_2, randomNumber_3, randomNumber_4 ;

   private Double randomNumberGenerate() {
       randomNumber = (Math.random() * 9.5) + 1;
       randomNumber = Math.round(randomNumber * 10.0)/10.0;
       return randomNumber;
   }

   public void start() {
        randomNumber_1 = randomNumberGenerate();
        randomNumber_2 = randomNumberGenerate();
        gipotenuza();
        plosha();

        text(randomNumber_1,"A","Катет ");
        text(randomNumber_2,"B","Катет ");
        text(randomNumber_3, "C","Катет ");
        text(randomNumber_4, "","Площа ");


   }

   private void   text (Double number , String catet, String text) {
       System.out.println(text +catet +" = " +number );
   }
   private void gipotenuza () {
       randomNumber_3 = Math.sqrt (Math.pow(randomNumber_1,2) + Math.pow(randomNumber_2, 2)) ;
       randomNumber_3 = Math.round(randomNumber_3 * 10.0)/10.0;
   }
   private void plosha () {
       randomNumber_4 = 0.5 *(randomNumber_1 + randomNumber_2);
       randomNumber_4 = Math.round(randomNumber_4 * 10.0)/10.0;
   }




}


