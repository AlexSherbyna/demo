package com.alexs;

import java.util.Arrays;

public class myClass {
    private int a;
    private int b;
    private int c;
    public int a1 , a2, a3;
    public int b1 , b2, b3,b4;
    int arr [] = new int[3];


    public void setA(int a1) {
        this.a = a1;

    }
    public int getA() {
        return a;
    }
    public void setB( int b1) {
        this.b = b1;
    }
    public int getB() {
        return b;
    }
    public void setС(int c1) {
        this.c = c1;
    }
    public int getC() {
        return c;
    }

    void triangle() {
        if ((a + b) <= 180){

            if (a < 90 && b < 90) System.out.println(" Ostroygolnik");
            if (a > 90 | b > 90 ) System.out.println(" Tupougolnik");
            if (a == 90 | b == 90) System.out.println(" Pramoygolnik");
            if (a == b ) System.out.println(" Ravnobedren");
            if (a == 60 &&  b == 60) System.out.println(" Ravnostoronii");


        } else{
            System.out.println(" Not_korect");
        }
    }
    void happy() {
        int a1,a2,a3,a4;
        int b1, b2,b3,b4;
        a1 = a/1000; // ***---
        a2 = a1/100;
        a3 = (a1/10)%10;
        a4 = a1%10;

        b1 = a%1000; // ---***
        b2 = b1/100;
        b3 = (b1/10)%10;
        b4 = b1%10;
        if (((a2+a3+a4) == (b2+b3+b4)) && ((a2+a3+a4)%2 == 0) && ((b2+b3+b4)%2 == 0)){
            System.out.println("Happy");
        } else System.out.println("Not_Happy");
        System.out.println();
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
    void lin() {
        if (a != 0 && b > 0){
            System.out.println("One");
            System.out.println(-b/a);
        }
        if (a == 0 && b!= 0){
            System.out.println("Not_koren");

        }
        if ( a == 0 && b == 0) System.out.println("All_number");
    }
    void bigOrNot() {


        if(a == b && b == c) System.out.println("All numbers the same");
        else {

            if(a!= b && b == c) System.out.println(" B the same C");

            if(a!= c && a == b) System.out.println(" A the same B");

            if(a!= b && a == c) System.out.println(" A the same C");

        }
        notTheSame();
    }
    private void notTheSame() {
        if(a > b && a > c) System.out.println("A is big");
        if(a < b && b > c) System.out.println(" B is big");
        if(c > a && c > b) System.out.println("C is big");


    }
    void flat() {
        if(a == b && a == c) System.out.println("All numbers flat");
        else System.out.println("Not flat");
    }
    void upDown() {
        int a1,a2,a3;
        boolean bool1 = false ,bool2 = false;
        a1 = a/100;
        a2 = (a/10)%10;
        a3 = a%10;
            if (a1 < a2 && a2 < a3) {
                System.out.println("Up");
                bool1 = true;
            }

            if (a1 > a2 && a2 > a3) {
                System.out.println("Down");
                bool2 = true;
            }
            if (bool1!= true && bool2!= true) System.out.println("Not");


    }
    void ocenka() {

        if( a > 0 && a < 6  ) {
            if (a == 1 || a == 2) System.out.println("Ne zachot");
            if (a == 3 || a == 4) System.out.println("Good");
            if (a == 5) System.out.println("The best");
        } else System.out.println("Mistake");
    }
    void season() {
        if(a <= 0 || a >= 13) {
            System.out.println("Mistake_1 try again");
        } else {
            if(a >= 3 && a <= 5) System.out.println(" Vesna");
            if(a >= 6 && a <= 9) System.out.println(" Leto");
            if(a >= 10 && a <= 11) System.out.println(" Osen");
            if(a == 12 || a <= 2) System.out.println(" Zima");
        }
    }
    void day_or_night() {
        if (a > 0 && a < 25) {
            if (a >= 6 && a < 10) System.out.println("Morning");
            if (a >= 10 && a <= 18) System.out.println("Day");
            if (a > 18 && a <= 22) System.out.println("Evening");
            if (a > 22 || a < 6) System.out.println("Night");
        } else {
            System.out.println("FAIL");
        }
    }
    void triangle_2 () {
        if (a1 != 0 && a2 != 0 && a3 !=0) {
            arr[0] = a1;
            arr[1] = a2;
            arr[2] = a3;
            Arrays.sort(arr);

            if ( arr[2] < (arr[1] + arr[0])) {
                System.out.println("Triangle");
            } else  {
                System.out.println("Fail_1");
            }
        } else {
            System.out.println("Fail");
        }

    }
    void cub () {
        if ( a1 != a2) System.out.println("Not cub");
        else System.out.println("Cub!");
    }
    void time () {
       if (a1 > 0 && a1 < 60 ) System.out.println("0." + a1);
           if (a1 > 60 && a1 < 3600) System.out.println( a1/60 + "."+ a1%10 );
                if (a1 > 3600 && a1 < 86400)   System.out.println(a1/3600 + ":"+ a1/ 60 % 60 + ":" + a1 % 60 );


    }
    void money () {
        a1 = a/100;
        a2 = (a-((a/100)*100))/50;
        a3 = (a-((a2*50)+(a1*100)))/10;

        if ((a1*100 +a2*50+a3*10)==a ) {
            System.out.println("Купюр по 100" +"-"+ a1 +" "+ "и "+"купюр по 50"+ " -"+ a2 +" "+"и "+
                    "купюр по 10"+ " -"+ a3 );

        } else System.out.println("Not");

    }
    void chetno_2 () {
        a1 = a/100;
        a2 = (a%10)/10;
        a3 = a%10;
        if ((a1+a2+a3)%2 == 0 && a1%2 == 0 && a2%2 == 0 && a3%2 ==0) System.out.println("Chetko");
        else System.out.println("Not_");
    }
    void rock () {
        a1 = a/100;
        a2 = (a/10)%10;
        a3 = a%10;
        if(a2 > a1 && a2 > a3) System.out.println("Rock");
        else System.out.println("Not_rock");
    }
    void pit () {
        a1 = a/100;
        a2 = (a/10)%10;
        a3 = a%10;
        if(a2 < a1 && a2 < a3) System.out.println("Pit");
        else System.out.println("Not_Pit");
    }
    void show () {
        System.out.println(a1+a2);
    }
    void inside () {
        int i;
            arr[0] = b/100;
            arr[1] = (b/10)%100;
            arr[2] = b%100;
            b4 = 0;

        for ( i = 0; i <= 2; i++){
            if(a == arr[i]) {
             b4++;
            }
        }
        System.out.println("Число "+a+" в числе "+b+" встречается "+ b4+" раз" );


    }
    void how () {
        b4 = 1;
        arr[0] = a/100;
        arr[1] = (a/10)%10;
        arr[2] = a%10;
        if (arr[0] != arr[1]){
            if (arr[1] == arr[2])  b4+=1;
        } else  b4+=1;

        if (arr[0] == arr[2]) b4+=1;

        System.out.println("Число "+a+" содержит "+ b4+" одинаковых цифр");
    }
    void drob_3() {
        arr[0] = a/100;
        arr[1] = (a/10)%10;
        arr[2] = a%10;
    }
}
