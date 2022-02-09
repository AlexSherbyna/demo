import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a, b, c ,d, v;
        float a1;
        a = in.nextInt();
        if(a%2 == 0){
            System.out.println(" 2 chislo drob");
            a1 = in.nextFloat();
            a1 = (a*a1);
            System.out.println(a1);
        } else {
            System.out.println(" 2 chislo");
            b = in.nextInt();
            a = a+b;
            System.out.println(a);
        }

    }
}

