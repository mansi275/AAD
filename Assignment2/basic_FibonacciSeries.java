package com.mpstme;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Print Fibonacci Series for ___ numbers: ");
        int n = number.nextInt();
        System.out.println(n);

        int n1=0, n2=1, n3=0;
        int i=1;
        while (i<=n){
            System.out.print(n1 + " ");

            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }

    }
}
