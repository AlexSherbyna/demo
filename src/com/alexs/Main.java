package com.alexs;

import java.util.Scanner;

public class Main {
    public static Scanner in=new Scanner(System.in);

       public static void main(String[] args) {

    /* кинетическая энергия тела
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
    // Градусы цельсия

       double tempC = 0.0;
       System.out.println("температура в цельсиях");
       tempC = scanner.nextDouble();
       System.out.println("температура в фарангейтах " + ((tempC * 1.8)+32));
    // сантиметры в дюймы
       double cm = 0.0,inch = 0.0;
       System.out.println("длинна в сантиметрах");
       cm = scanner.nextDouble();
       inch = (cm / 2.54);
       System.out.println("Длинна в дюймах " );
       System.out.println(inch);
       System.out.format("%.2f %n",inch );
    // числа +2
       int a11 = 0;
       System.out.println("Введите число " );
       a11 = scanner.nextInt();
       for (int i = 0; i < 3; i++)
       {

           System.out.println (a11 = ( a11 + 2));
       }
    */
       int a,b,c,sum;
           System.out.println("Количество крышок_10");
        a = in.nextInt() * 10;
           System.out.println("Количество крышок_100");
        b = in.nextInt() * 100;
           System.out.println("Количество крышок_1000");
        c = in.nextInt() * 1000;
           System.out.println("Количество крышок " + (a+b+c));
    }

}