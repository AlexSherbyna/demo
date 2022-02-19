import com.alexs.Films;

import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
        do{
            a1 = in.nextInt();
            a2 = in.nextInt();
            a3 = in.nextInt();

            if(a1 == a2 && a1 == a3) System.out.println(" Chisla rovnu");
            if(a1 > a2 ) {
                if(a2 == a3) System.out.println("A3 = A2 "+a3);
                if(a1 > a3) System.out.println("A1 bolshe vsex "+a1);
                else {
                    if(a1 == a3)System.out.println("A1 = A3 "+a1);
                    if(a1 == a2) System.out.println("A1 = A2 "+a1);
                    System.out.println("A3 bolshe vsex "+a3);
                }
            } else {
                if(a2 == a3) System.out.println("A3 = A2 "+a3);
                if(a1 < a3) System.out.println("A3 bolshe vsex "+a3);
                else {
                    if (a1 == a3)System.out.println("A1 = A3 "+a1);
                    if(a1 == a2) System.out.println("A1 = A2 "+a1);
                    System.out.println("A1 bolshe vsex "+a1);
                }

            }
        }while (true);
    }
}

