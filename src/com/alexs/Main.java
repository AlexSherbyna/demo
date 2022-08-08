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
                    System.out.println(" ----------");

               randNumber_1 = (int) (Math.random() * 90) + 10;
                    class_1.setA(randNumber_1);

               randNumber_2 =  (int) (Math.random() * 90) + 10;
                    class_1.setB(randNumber_2);
                    class_1.diapazon();

               randNumber_3 = (int) (Math.random() * (class_1.getB() - class_1.getA() +1)) + class_1.getA();
                    System.out.println(randNumber_3);
               randNumber_3 = 0;

               randNumber_3 = (int) (Math.random() * (class_1.getB() - class_1.getA() +1)) + class_1.getA();
                    System.out.println(randNumber_3);
               randNumber_3 = 0;

               randNumber_3 = (int) (Math.random() * (class_1.getB() - class_1.getA() +1)) + class_1.getA();
                    System.out.println(randNumber_3);
               randNumber_3 = 0;


           }

        }
    }