package com.alexs;

public class myClass {
    private int a;
    private int b;
    private int c;

    public void setA(int a1){
           a = a1;
            }
    public int getA() {
        return a;
    }
    public void setB( int b1){

            b = b1;

    }
    public int getB() {
        return b;
    }
    public void setС(int c1){
        c = c1;
    }
    public int getC(){
        return c;
    }

    void triangle(){
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
    void happy(){
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
    void lin(){
        if (a != 0 && b > 0){
            System.out.println("One");
            System.out.println(-b/a);
        }
        if (a == 0 && b!= 0){
            System.out.println("Not_koren");

        }
        if ( a == 0 && b == 0) System.out.println("All_number");
    }
    void bigOrNot(){


        if(a == b && b == c) System.out.println("All numbers the same");
        else {

            if(a!= b && b == c) System.out.println(" B the same C");

            if(a!= c && a == b) System.out.println(" A the same B");

            if(a!= b && a == c) System.out.println(" A the same C");

        }
        notTheSame();
    }
    private void notTheSame(){
        if(a > b && a > c) System.out.println("A is big");
        if(a < b && b > c) System.out.println(" B is big");
        if(c > a && c > b) System.out.println("C is big");


    }
}
