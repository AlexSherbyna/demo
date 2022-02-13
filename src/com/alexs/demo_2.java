import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a = 0, b1, b2 ,b3, v,t,g;
        double a1;
        int mass [] = new int[3];
        do{
            a = in.nextInt();
           if(a>40 && a<100){
               System.out.println("Yes");
           } else {
               System.out.println("Now");
           }
        }while (true);
    }
}

