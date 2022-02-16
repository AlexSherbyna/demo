import com.alexs.Films;

import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int a,b,c;
        do{
            a = in.nextInt();
            b = in.nextInt();
            c = 180-(a+b);

        up:  if(a>90 | b>90 |c>90){
                System.out.println(c);
                System.out.println("Typoi");
            } else {
                if (a == 90 | b == 90 | c == 90) {
                    System.out.println(c);
                    System.out.println("Pr9moi ");
                    break up ;
                }
                System.out.println(c);
                System.out.println("Ostryi");
            }
        }while (true);
    }
}

