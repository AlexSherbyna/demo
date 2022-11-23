package com.alexs;

import java.util.Scanner;

public class GameMagicNumber {
    Scanner scanner = new Scanner(System.in);
    public Integer x1 = null, x2 = null, y1 = null, y2 = null, randomNumber;
    public Integer randomNumberMin = -30;
    public Integer randomNumberMax = 30;


   private Integer randomNumberGenerate() {
       randomNumber = randomNumberMin + (int) ((randomNumberMax - randomNumberMin + 1)*Math.random()) ;
       return randomNumber;
   }

   public void start() {
       kordinate();
       uiKordinate(x1,y1);
       uiKordinate(x2,y2);
       uiText("Длинна отрезка = ",allLong(x1,y1,x2,y2));
       uiText("Угол = ",ugol(x1,y1,x2,y2));
       cros(position(x1,y1),position(x2,y2));
       uiText("Пересикают " + cros(position(x1,y1),position(x2,y2))+ " ",null);


   }

   private void kordinate() {
       x1 = randomNumberGenerate();
       y1 = randomNumberGenerate();
       x2 = randomNumberGenerate();
       y2 = randomNumberGenerate();
   }

   private void uiKordinate(Integer x, Integer y) {
       System.out.println("Кордината  Х = " + x +" кордината  Y = " + y );
   }

   private Integer allLong(Integer x1, Integer y1,Integer x2, Integer y2) {
       Integer allLong;
       Integer katetOne = null;
       Integer katetTwo = null;
       Double katetOneDouble = null;
       Double kateTwoDouble = null;


       katetOne = Math.abs(x1 - x2);
       katetTwo = Math.abs(y1 - y2);
       System.out.println(katetOne);
       System.out.println(katetTwo);

       katetOneDouble = (double)katetOne;
       kateTwoDouble = (double)katetTwo;

      return allLong = (int) Math.hypot(katetOneDouble,kateTwoDouble) ;
   }

   private Integer ugol(Integer x1, Integer y1,Integer x2, Integer y2) {
       Double ugolDobl = null;
       ugolDobl =  Math.atan(1.0*(y2-y1)/(x2-x1));
       return (int)Math.toDegrees(ugolDobl);
   }

   private Integer position(Integer x1, Integer y1) {
       if(x1 > 0 && y1 < 0) return 1;
       if(x1 < 0 && y1 < 0) return 2;
       if(x1 < 0 && y1 > 0) return 3;
       if(x1 > 0 && y1 > 0) return 4;
       return 0;

   }

   private String cros(Integer firstPoint , Integer secondPoint) {
       if(firstPoint == secondPoint) return "ничего";
       else {
           if ((firstPoint + secondPoint) == 5) {
               return "X";
           } else {
               if ((firstPoint + secondPoint) % 2 == 0) {
                   return "X,Y";
               } else {
                   return "Y";
               }
           }
       }

   }

   private void uiText(String text, Integer number) {
       System.out.println(text + number);
   }
}


