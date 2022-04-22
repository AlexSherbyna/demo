package com.alexs;

public class myClass {
    private int a;
    private int b;

    public void setA(int a1){
        if(a1 > 0 & a1 < 999999){
            a = a1;
        } else {
            System.out.println("Fail_1");

        }
    }
    public int getA() {
        return a;
    }
    public void setB( int b1){
        if(b1 > 0 & b1 < 180){
            b = b1;
        } else {
            System.out.println("Fail_2");
        }
    }

    public int getB() {
        return b;
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
}
