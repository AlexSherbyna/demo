package com.alexs;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MyClass_2 class_1 = new MyClass_2();
        Random randomNumber = new Random();
           while (true) {

              int rand, randNumber_1, randNumber_2, randNumber_3;
               System.out.println(" Number");

               rand = (int) (Math.random() * 100);

                     System.out.println(rand);
                     System.out.println(" -- ");

               randNumber_1 = (int)(Math.random() * rand);
                    System.out.println(randNumber_1);

               randNumber_2 =  (int)(Math.random() * rand);
                     System.out.println(randNumber_2);

               randNumber_3 =  (int)(Math.random() * rand);
                    System.out.println(randNumber_3);


           }

        }
    }