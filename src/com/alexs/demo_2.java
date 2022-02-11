import java.util.Scanner;
import java.util.SortedMap;

public class demo_2 {

    public static Scanner in=new Scanner(System.in);
    public static void main(String args[]) {
        int a = 0, b, c ,d, v,t,g;

        int nums [][] = new int[3][5];

        for (int i = 0; i<3; i++){
            for(int j = 0; j<5; j++){
                nums[i][j] = (i+1)*(j+1);
                System.out.println(i+" "+j+" "+nums[i][j]);
            }
        }
        for(int x[]:nums){
            for(int y:x){
                System.out.println(y);
                a +=y;
            }
        }
        System.out.println(a);

    }
}

