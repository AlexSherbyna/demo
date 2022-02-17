import com.alexs.Films;

import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int a,a1 = 0,a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0, sum1,sum2;
        do{
            a = in.nextInt();
           if(a/100000 != 0){
               a1 = (a/100000);
               a2 = (a/10000)%10;
               a3 = (a/1000)%10;
               a4 = (a/100)%10;
               a5 = (a/10)%10;
               a6 = a%10;
               sum1 =(a1+a2+a3);
               sum2 = (a4+a5+a6);

               if((sum1 == sum2) && (sum1 %2) == 0 && (sum2 %2) == 0){
                   System.out.println("Hapy number");
               } else {
                   System.out.println("Not Hapy =(");
               }

           } else {
               System.out.println("Fail");
           }


        }while (true);
    }
}

