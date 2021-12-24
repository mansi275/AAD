package com.mpstme;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n = number.nextInt();

        int numSquare = n*n;
        int temp=n, len=0;

        while (temp>0){
            len++;
            temp=temp/10;
        }

        int place=1, x=0;
        for (int i=0;i<len;i++){
            x += (numSquare%10)*place;
            numSquare = numSquare/10;
            place = place*10;
        }

        if (x==n){
            System.out.println(n+" is an Automorphic Number");
        } else
            System.out.println(n+" is not an Automorphic Number");
    }
}
