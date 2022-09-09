package com.alexs;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        MyClass_2 class_2 = new MyClass_2();
        myClass class_1 = new myClass();

        int player_1, player_2;

           while (class_2.getStoped()) {
                for(int a = 1; a < 11; a++) {

                        player_1 = class_2.cube();
                        player_2 = class_2.cube();

                        System.out.println(" ----------");
                        System.out.println("GAME " +a);
                        System.out.println("Player 1 your number");

                        class_1.getTableResolt()[a][1] = Integer.toString(player_1);
                        class_1.getTableResolt()[a][0] = Integer.toString(a);
                        class_1.getTableResolt()[a][2] = Integer.toString(player_2);

                        System.out.println(player_1);
                        System.out.println("Player 2 your number");
                        System.out.println(player_2);
                }

               System.out.println("GAME OVER");

               class_2.sTop();

               for (int i = 0; i < 11; i++) {
                   for (int v = 0; v < 3; v++) {
                       if (i == 0) {
                           System.out.print(class_1.getTableResolt()[i][v]);
                           System.out.print(" ");
                       } else {
                           System.out.print("  ");
                           System.out.print(class_1.getTableResolt()[i][v]);
                           System.out.print(" ");
                       }
                   }
                   System.out.println(" ");
               }
          }
    }

}

