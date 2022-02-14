package com.alexs;

import java.util.Scanner;

public class Films {
    public int eta_1,number;
    public static Scanner in=new Scanner(System.in);

    public void tol(){
        eta_1 = number/3;
        if(eta_1 !=0) eta_1 = (int)Math. ceil(eta_1+1);

        System.out.println("Етаж"+" "+eta_1);
        if(number%3 == 0){
            System.out.println("Крайняя правая дверь");
        } else {

        }

    }

}
