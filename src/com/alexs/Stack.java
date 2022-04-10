package com.alexs;
import java.util.Scanner;

public class Stack {
    public int number;
    int fact(int n){

        int result;
        if (n == 1) return 1;
        result = fact(n-1)*n;
        return result;
    }

}
