package com.alexs;
import java.util.Scanner;

public class Stack {
    public int number;
    int stc[] = new int[10];
    public static Scanner in = new Scanner(System.in);

    Stack(){
        number = -1;
    }

   void push(int item){
       if(number == 9){
           System.out.println("Full stack");
       } else {
           stc[++number] = item;
       }
   }
   int pop(){
       if (number<0){
           System.out.println("Free stack");
           return 0;
       } else {
           return stc[number--];
       }
   }

}
