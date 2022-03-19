package com.alexs;
import java.util.Stack;
import java.util.Scanner;


public class Demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {

        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
       while (true){
           a = in.nextInt();
            if(a < 24 && a!= 0 ){
                if(a >= 6 && a <= 10 ) System.out.println("Morning");
                if(a > 10 && a <= 18 ) System.out.println("Day");
                if(a > 18 && a <= 22 ) System.out.println("Evening");
                if(a > 22 && a <= 24 || a < 6 ) System.out.println("Night");
            }
       }

    }
}

