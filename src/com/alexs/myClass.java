package com.alexs;

public class myClass {
    private int a;
    private int b;

    public void setA(int a1){
        if(a1 > 0 & a1 < 180){
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
            if (a == 90 & b == 90) System.out.println(" Unreal");
            if (a < 90 & b < 90) System.out.println(" Ostroygolnik");
            if (a > 90 || b > 90 ) System.out.println(" Tupougolnik");
            if (a == 90 || b == 90) System.out.println(" Pramoygolnik");
            if (a == b ) System.out.println(" Ravnobedren");
            if (a == 60 & b == 60) System.out.println(" Ravnostoronii");


        } else{
            System.out.println(" Not_korect");
        }
    }
}
