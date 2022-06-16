package com.alexs;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MyClass_2 class_1 = new MyClass_2();
           while (true) {
               System.out.println(" Please take you numbers ");
               class_1.setA(in.nextInt());
               class_1.function_1();

           }
        }
    }