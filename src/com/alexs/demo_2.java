import java.util.Scanner;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Введи двузначное число");
        int b,c,v;
        int a = in.nextInt() ;
        b = a/100;//*__
        c = (a%100)/10;  //_*_
        v = a%10;//__*

        System.out.println(v +""+ c +""+ b);
        c+=-2;
        System.out.println(v +""+ c +""+ b);
        System.out.println(v+c+b);
        System.out.println(v-c-b);



    }
}

