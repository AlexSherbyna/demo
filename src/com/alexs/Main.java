package com.alexs;

import java.util.Scanner;

public class Main {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {

     double a,b,c;
     a = 15;
     b = 50;
     c = (a * 3600)+(b*60);
        System.out.println(c);
     c = c/60;
        System.out.println(c);

     c = (24 * 60) -c;
        System.out.println(c);

        // кинетическая энергия тела
        int a1,b1,c1;
        a1 = 5;
        b1 = 12;
        c1 = a1*b1;
        System.out.println(Math.pow(c1, 2)/2);
    // обратное число
        int a2 = 15;
        System.out.println(-a2);
    // имя фамилия
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.println("Вас зовут "+ s1 + s2);
    }




}