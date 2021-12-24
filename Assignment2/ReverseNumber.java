package com.mpstme;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int n = number.nextInt();
        System.out.println(n);

        int temp = n, r=0;
        while (temp>0){
            r = r*10 + temp%10;
            temp = temp/10;
        }
        System.out.println("Reversed number is: "+r);

    }
}
