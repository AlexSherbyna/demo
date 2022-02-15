package com.alexs;

import java.util.Scanner;

public class Films {
    public int eta_1,number;
    public static Scanner in=new Scanner(System.in);

    public void tol(){
        eta_1 = number/3;

            if(number%3 != 0){
                eta_1 = (int)Math. ceil(eta_1+1);
                if (number%3 ==6){
                    System.out.println("Центральная дверь");
                } else {
                    System.out.println("Левая дверь");
                }
            } else {
                System.out.println("Крайняя правая дверь");
            }
                System.out.println("Етаж"+" "+eta_1);


    }

}
