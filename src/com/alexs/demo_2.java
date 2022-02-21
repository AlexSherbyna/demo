package com.alexs;
import java.util.Stack;
import java.util.Scanner;


public class Demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        Stack mystc_1 = new Stack();
        Stack mystc_2 = new Stack();
        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;

            for(int i = 0 ;i < 10 ;i++) mystc_1.push(i);
            for(int i = 10 ;i < 20 ;i++) mystc_2.push(i);

            System.out.println("Stack_1");
            for (int i = 0; i < 10; i++){
                System.out.println(mystc_1.pop());
            }
            System.out.println("Stack_2");
            for (int i = 0; i < 10; i++){
                System.out.println(mystc_2.pop());
            }
            System.out.println(mystc_1.empty());
            System.out.println(mystc_2.empty());


    }
}

