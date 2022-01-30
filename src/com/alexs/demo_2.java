import java.util.Scanner;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        // System.out.println("Введи 4-значное число");
        /*int b,c,v;
        int a = in.nextInt() ;
        b = a/100;//*__
        c = (a%100)/10;  //_*_
        v = a%10;//__*

        System.out.println(v +""+ c +""+ b);
        c+=-2;
        System.out.println(v +""+ c +""+ b);
        System.out.println(v+c+b);
        System.out.println(v-c-b);

        int a = in.nextInt();
        System.out.println("Введи 4-значное число");
        int b = in.nextInt();
        int a1,a2,a3,a4,e =0,e1=0 ;
        int b1,b2,b3,b4,be =0,be1=0 ;
        a1 = a/1000;            // *___
        a2 = (a%1000)/100;      // _*__
        a3 = (a%100)/10;        // __*_
        a4 = a%100;             // __*
        b4 = b%100;             // __*
        e = (a/100)*100 +b4;
        be = (b/100)*100 +a4;
        System.out.println(e);
        System.out.println(be);
*/
        int b;
        int a = in.nextInt();
        if ( a>0 ){
            b = a/100;
            if (b > 1){
                a-=1;
                System.out.println(a);
            } else {
                System.out.println("malo");
            }
        } else {
            System.out.println("!!!!!!");
        }



    }
}

