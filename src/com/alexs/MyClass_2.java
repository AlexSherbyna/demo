package com.alexs;

 public  class   MyClass_2 extends AbClass {
     private int a;
     private int b;
     private boolean stoped = true;
     private int maxVolume , minVolume , randomNumberDiapazon;

     public void setStoped(boolean stoped) {
         this.stoped = stoped;
     }

     public boolean getStoped() {
         return stoped;
     }

     public int getA() {
         return a;
     }
     public void setA(int a) {
         this.a = a;
     }
     public int getB() {
         return b;
     }
     public void setB(int b) {
         this.b = b;
     }


     public void function_1() {
         if (a < 1500 || a > 1999) System.out.println("Fail_1");
         else {
             System.out.println(a / 100 + 1);
             System.out.println("Vek");
         }
     }
     public void shift() {
        int year = a;

         System.out.println(year % 4 == 0 ? "leap year" :"not leap year");
     }
     public void fraction() {
        int number = a;
        int numerator,denominator;
            numerator = a/10;
            denominator = a%10;
         System.out.println(numerator<denominator ? " right fraction" : numerator/denominator + "."+numerator%denominator );
     }
     public void diapazon () {
         if ( a != b){
             if ( a > b) {
                 System.out.println(" Diapazon  ot " +b +" do " +a);
                 rotate();

             } else {
                 System.out.println(" Diapazon  ot " +a +" do " +b);
             }
         } else {
             b += 10;
         }

     }
     public void rotate () {
         int a1;
         a1 = b;
         b = a;
         a = a1;
     }
     public  void sTop () {
         stoped = false;
     }
     public void centerVolume () {

         a = (int)( Math.random() * 100);

         // enter number show diapazon center , value diapazon 11 numbers
         maxVolume = a + 5;
         minVolume = a - 5;

             System.out.println(getA());
             System.out.println("Diapazon : " + minVolume + " - " + maxVolume );

         randomNumberDiapazon = (int)( Math.random() * (maxVolume - minVolume)) + minVolume;

             System.out.println("Random number 1 : "+ randomNumberDiapazon);
        // did the computer guess the number

         b = (int)( Math.random() * (maxVolume - minVolume)) + minVolume;

             System.out.println("Random number 2 : " +b);

         if(randomNumberDiapazon == b) {
             System.out.println("Number guessed " );
             System.out.println(randomNumberDiapazon+ " : " +b);
             sTop();

         } else {
             System.out.println("Not guessed");
             if ( randomNumberDiapazon > b) {
                 System.out.println("Too Small");
             } else {
                 System.out.println("Too big");
             }
         }
         a = 0;
         b = 0;





     }

}




  /*  void myClass_2_fun () {

        if ((a1 + a2 + a3 != 180) || (a1 == 0) || (a2 == 0) || (a3 == 0)) System.out.println("Not triangle");
         else   System.out.println("Triangle");
    }
    void show (String msg) {

        System.out.println( msg +" "+(a1+a2+a3));
    }
    void how(int a) {
        b4 = 1;
        arr[0] = a/100;
        arr[1] = (a/10)%10;
        arr[2] = a%10;
        if (arr[0] == arr[1]){
            if (arr[1] != arr[2])  b4+=1;
        } else  b4+=1;

        if (arr[0] != arr[2]) b4+=1;
        System.out.println("Число "+getA()+" содержит "+ b4+" разных  цифр");
    }
    void how( String msg) {
        super.drob_3();
        if(arr[0] != 0 &&(getA()%arr[0])== 0) System.out.println(msg + "Число делиться на " + arr[0]);
        if(arr[1] != 0 && (getA()%arr[1])== 0) System.out.println(msg + "Число делиться на " + arr[1]);
        if(arr[2] != 0 && (getA()%arr[2])== 0) System.out.println(msg + "Число делиться на " + arr[2]);
    }*/


