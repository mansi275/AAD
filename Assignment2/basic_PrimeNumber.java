package com.mpstme;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n = number.nextInt();
        System.out.println(n);

        int flag = 0;
        if (n==0){
            System.out.println("Not a prime number");
            flag = 1;
        } else if (n==1){
            System.out.println("Neither prime nor composite - Unique Number");
            flag = 1;
        } else  {
            for (int i=2;i<n;i++){
                if (n%i==0){
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }

        if (flag==0){
            System.out.println("Prime Number");
        }
    }
}
