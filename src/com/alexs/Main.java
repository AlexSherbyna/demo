package com.alexs;

import java.util.Scanner;

public class Main {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {

     double a,b,c;



        // кинетическая энергия тела
        int a1,b1,c1;
        a1 = 5;
        b1 = 12;
        c1 = a1*b1;
        System.out.println(Math.pow(c1, 2)/2);
    // обратное число
        int a2 = 15;
        System.out.println(-a2);
    // имя фамилия инициалы с большой буквы
        Scanner scanner = new Scanner(System.in);
        String s1, s2,s3;

        System.out.println("Имя ");
        s1 = scanner.nextLine();

        System.out.println("Фамилия ");
        s2 = scanner.nextLine();
        s2.toUpperCase();

        System.out.println("Отчество");
        s3 = scanner.nextLine();


        System.out.println("Вас зовут "+ s1.substring(0,1).toUpperCase() +s1.substring(1) +" " + s2.substring(0,1).toUpperCase() +"." + s3.substring(0,1).toUpperCase() +".");
    }




}