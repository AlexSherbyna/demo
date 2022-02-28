package com.alexs;
import java.util.Stack;
import java.util.Scanner;


public class Demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {

        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
       while (true){
           a = in.nextInt();
            if(a < 13 && a!= 0 ){
                if(a == 12 ) System.out.println("Zima");
                if( a <= 2) System.out.println("Zima");
                if(a<= 5 && a>= 3) System.out.println("Vesna");
                if(a<= 8 && a>= 6) System.out.println("Leto");
                if(a<= 11 && a>= 9) System.out.println("Osin");
            }


       }

    }
}

