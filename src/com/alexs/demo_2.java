import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a = 0, b1, b2 ,b3, v,t,g;
        do{
            a = in.nextInt();
           if(a>999){
               System.out.println("Fail_1");
           } else {
               b1 = a/100;
                   if(b1 != 0){
                       if(b1%2 ==0){
                           b1+=1;
                       } else {
                           b1-=1;
                       }
                   }
               b2 = (a/10)%10;
                   if(b2 != 0){
                       if(b2%2 ==0){
                           b2+=1;
                       } else {
                           b2-=1;
                       }
                   }
               b3 = a%10;
                   if(b3 != 0){
                       if(b3%2 ==0){
                           b3+=1;
                       } else {
                           b3-=1;
                       }
                   }

               System.out.println(b1+""+b2+""+b3);
           }

        }while (true);


    }
}

