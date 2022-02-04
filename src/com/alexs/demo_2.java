import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a, b, c = 0, v;
        double kor;
        a = in.nextInt();
        if (a%2!=1)
        {
            b=a/2;
            c=(a+b)%10;
            System.out.println("+++");
            System.out.println(b);
            System.out.println(c);
            System.out.println(a+b+c);
        }
        else
        {
            b=a/2+1;
            c=(a*b)%10;
            System.out.println("---");
            System.out.println(b);
            System.out.println(c);
            System.out.println( c-a-b);
        }
    }
}

