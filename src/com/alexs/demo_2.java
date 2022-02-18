import com.alexs.Films;

import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
        do{
            a = in.nextInt();
            a1 = in.nextInt();
            if(a != 0){
                System.out.println("Odin koren");
                sum1 = (a1/a);
                System.out.println(sum1);
            }
            if(a == 0 && a1 != 0)System.out.println("Net kornei");
            if(a == 0 && a1 ==0) System.out.println("Any number ");
        }while (true);
    }
}

