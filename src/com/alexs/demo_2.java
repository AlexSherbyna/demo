import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a, b, c,v;
        double kor;
            System.out.println("1 katet");
        a = in.nextInt();
            System.out.println("2 katet");
        b = in.nextInt();
            System.out.println("Gipo");
        c = in.nextInt();
         kor = Math.sqrt(a*a + b*b );
         v = (int) kor;

        System.out.println(v);

        if(c == v ) System.out.println("yes");
        else System.out.println("No");

    }

}

