package com.alexs;

public class GameMagicNumber {

    private Double randomNumber, randomNumber_1, randomNumber_2, gipotenuza, grad ;

   private Double randomNumberGenerate() {
       randomNumber = (Math.random() * 59) + -(30);
       randomNumber = Math.ceil(randomNumber);

       return randomNumber;
   }

   public void start() {
        randomNumber_1 = randomNumberGenerate();
        randomNumber_2 = randomNumberGenerate();

        text(randomNumber_1, "X", "");
        text(randomNumber_2, "Y", "");
        text(chetvert(randomNumber_1,randomNumber_2), ". Cetvert", "Blishe os " +toClose(randomNumber_1,randomNumber_2));
        text(distans(randomNumber_1,randomNumber_2), "Distanse" , "");
        text(grad(randomNumber_2, randomNumber_1), "Gradysu", "");

   }
   private String toClose( Double x, Double y ) {
       x = Math.abs(x);
       y = Math.abs(y);
       if(x < y) return "Y";
       return "X";
   }

   private Double chetvert( Double x, Double y) {
       if(y > 0 && x < 0) return 1.0;
       if(y > 0 && x > 0) return 2.0;
       if(y < 0 && x < 0) return 3.0;
       if(y < 0 && x > 0) return 4.0;
       return 0.0;
   }

   private void   text (Double number , String catet, String text) {
       System.out.println(text +catet +" = " +number );
   }

   private Double distans ( Double x, Double y) {
       return gipotenuza = Math.ceil(Math.hypot(x,y)) ;
        }

   private Double grad(Double x, Double y) {
       grad = Math.atan( 1.0 *  y/ x);
       return grad = Math.ceil(Math.toDegrees(grad)) ;
   }

}


