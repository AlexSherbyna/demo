import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a, b, c ,d, v;

        a = in.nextInt();
        b =  a/100;      //*--
        c = (a/10)%10;   //*--

        v =  a%10;       //--*
       if(b+c == b || c+v == (v|c)) {
            System.out.println("est 0");
        }


    }
}

