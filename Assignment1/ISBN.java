package com.mpstme;

import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = number.nextLong();
        System.out.println(num);

        int sum = 0;
        long temp = num;
        for (int i=1; i<=10; i++){
            sum+=(temp%10)*i;
            temp=temp/10;
        }

        if (sum%11==0){
            System.out.println("This is an ISBN Number.");
        } else  {
            System.out.println("This is not an ISBN Number.");
        }

        }
    }

