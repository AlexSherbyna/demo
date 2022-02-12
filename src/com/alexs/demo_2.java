import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a = 0, b1, b2 ,b3, v,t,g;
        int mass [] = new int[3];
        do{
                        a = in.nextInt();
                        if(a>999){
                       System.out.println("Fail_1");
                   } else {

                           b1 = a/100;
                           mass[0] = b1;

                           b2 = (a/10)%10;
                           mass[1] = b2;

                           b3 = a%10;
                           mass[2] = b3;

                                for(int i = 0; i < mass.length; i++){
                                   if(mass[i] != 0){
                                       if(mass[i]%2 ==0){
                                           mass[i]+=1;
                                       } else {
                                           mass[i]-=1;
                                       }
                                   }
                               }


                   }
            System.out.println(mass[0]+""+mass[1]+""+mass[2]);

        }while (true);


    }
}

