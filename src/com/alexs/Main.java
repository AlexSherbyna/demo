package com.alexs;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        MyClass_2 class_2 = new MyClass_2();
        String msg = null;
        int arr [][] = new int[11][3];
        arr[0][0] = (0);
        arr[0][1] = (1);
        arr[0][2] = (2);


        int player_1 = 0 , player_2 = 0 , num_3, num_4 , sum = 0;
           while (class_2.getStoped()) {

                for( int a = 1 ; a < 11 ;a++){

                        System.out.println(" ----------");
                        System.out.println("GAME " +a);
                        System.out.println("Player 1 your number");

                        arr[a][0] = a;
                        class_2.cube();

                        arr[a][1] = class_2.getA();
                        player_1 += class_2.getA();

                        System.out.println(class_2.getA());
                        System.out.println("Player 2 your number");

                        class_2.cube();
                        arr[a][2] =  class_2.getA();
                        player_2 += class_2.getA();

                        System.out.println(class_2.getA());



                        if(a == 10) {
                            System.out.println("GAME OVER");
                            class_2.sTop();
                                if(player_1 != player_2) {
                                    if (player_1 < player_2) {
                                        System.out.println("Player 2 WIN!!");
                                    } else {
                                        System.out.println("Player 1 WIN!!");
                                    }
                                }

                            for (int i = 0 ; i < 11 ; i++){
                                for (int v = 0 ; v < 3 ; v++){

                                    System.out.print(arr[i][v]);
                                    System.out.print(" ");
                                }
                                System.out.println();
                            }



                        }
                    }
          }
    }

}

