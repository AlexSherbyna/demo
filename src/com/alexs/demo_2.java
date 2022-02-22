package com.alexs;
import java.util.Stack;
import java.util.Scanner;


public class Demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {

        int a,a1 = 7,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
        int arr[] = { -3,0,2,4,5};
        int aa = arr[arr.length-1];
        int bb = arr[0];
        while (bb<aa){
            if((bb+aa)!= a1){
                if((bb+aa)<a1){
                    bb++;
                } else {
                    aa--;
                }
            } else {
                System.out.println(" aa "+ aa +" bb "+ bb);
                break;
            }

        }

    }
}

