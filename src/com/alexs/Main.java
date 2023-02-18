package com.alexs;
import com.alexs.Intresting.*;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 100; i < 999; i++) {
             arr.add(i);
        }
        for (int i: arr) {
            if(i % 80 == 45 ) System.out.print( " " +i);
        }

        System.out.println();





//        Intresting ob = new Intresting.Bilder(20,10).litr(1.0).text("Milk").bilder();


//        System.out.println(System.nanoTime());
//        ProcessBuilder p = new ProcessBuilder("calc");
//        try {
//            p.start();
//        } catch (Exception e){
//            System.out.println("Fail");
//        }


    }
}

