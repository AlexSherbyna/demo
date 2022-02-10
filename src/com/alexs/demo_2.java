import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a, b, c ,d, v,t,g;

        a = in.nextInt();
        b = a/10000;     //*----

        c = (a/1000)%10; //-*---

        d = (a/100)%10;  //--*--

        v = (a/10)%10;   //---*-

        t = a%10;        //----*

            g = (t * 10000) + (v * 1000) + (d * 100) + (c * 10) + b;

        if (b==0) g = (t * 1000) + (v * 100) + (d * 10) + c;
        if (c==0) g = (t * 100) + (v * 10) + d;
        if (d==0) g = (t * 10) + v;

        if(a<99999){
            if(a==g){
                System.out.println("Palindrom");
            } else {
                System.out.println("Fake");
            }
        } else {
            System.out.println("Big nuber");
        }



    }
}

