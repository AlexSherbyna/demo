package com.alexs;

import java.util.Scanner;

public class Main {
    public static Scanner in=new Scanner(System.in);

       public static void main(String[] args) {



           int mass[] = new int[]{10, 4, 3, 9, 11, 8, 15 };

           int a, b = 0, c, v = 1;


           for (a = 0; a < mass.length; a++)
           {
               System.out.println("********  ");
               System.out.println(mass[a] + " Chislo massiva");
               System.out.println(a + " iteracia");

                v = 1;

               for (b = a+1; b <= mass.length; b++) {


                   if (mass[a] == (mass[mass.length - 1])) {
                       System.out.println("Konec");
                       System.out.println("********  ");
                       System.out.println("");
                       break;
                   }

                   if (mass[a] < mass[b]) {
                       if (v == 1) {
                           System.out.println("poteplenie zavtra");
                           System.out.println("Sravnili s " + mass[b]);
                           System.out.println("********  ");
                           System.out.println("");
                           break;
                       } else {
                           System.out.println("Poteplenie  na " + v + " den");
                           System.out.println("Dney " + v);
                           System.out.println("Sravnili s  " + mass[b]);
                           System.out.println("********  ");
                           System.out.println("");
                           break;
                       }
                   } else {

                       v++;
                   }
               }

           }


       }
    }