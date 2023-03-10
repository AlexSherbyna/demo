package com.alexs.Intresting.All;


import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int userNumber, arNumber = 0 , stepNumber = 8 ;

        System.out.println("Your number");

        userNumber = Math.abs(scanner.nextInt()) ;

        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j < 10; j++) {
                if((i + j) == userNumber) System.out.print(" " + i+j);
            }



        }






    }


//        Intresting ob = new Intresting.Bilder(20,10).litr(1.0).text("Milk").bilder();


//        System.out.println(System.nanoTime());
//        ProcessBuilder p = new ProcessBuilder("calc");
//        try {
//            p.start();
//        } catch (Exception e){
//            System.out.println("Fail");
//        }


//    }
}

