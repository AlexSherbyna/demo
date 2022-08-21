package com.alexs;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        MyClass_2 class_2 = new MyClass_2();
        String msg = null;
        boolean move = true;
        int num_1 , num_2, num_3, sum = 0;
           while (move) {

                    System.out.println(" ----------");
                    System.out.println(" Your numbers");

                class_2.oneCard();
                    num_1 = class_2.getA();
                    System.out.println("First card " +num_1);

                class_2.oneCard();
                    num_2 = class_2.getA();
                    sum = num_1 + num_2;
                    System.out.println("Second card " +num_2);
                    System.out.println("Your sum :" +sum );
                    System.out.println("Do you ned one card? Y/N");
                    msg = in.nextLine();

                    if(msg.equals("Y")  || msg.equals("y")){
                        class_2.oneCard();
                        num_3 = class_2.getA();
                        System.out.println("Third card " +num_3);
                        sum+= num_3;
                    }

               System.out.println(sum);
               System.out.println(sum != 21 ? "Yo lose" : "Yo win");
               System.out.println("One more? Y/N");

               msg = in.nextLine();

               if(msg.equals("N")  || msg.equals("n")){
                   System.out.println(" GG my friend!");
                   move = false;

               }
           }

        }

    }