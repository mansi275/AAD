package com.mpstme;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        System.out.println(num);

        int sum = 0, len = 0;
        int temp = num;
        while (temp>0){
            ++len;
            temp=temp/10;
        }
        temp=num;
        while (temp>0){
            sum+=Math.pow(temp%10,len);
            temp=temp/10;
        }

        if (num==sum){
            System.out.println("This is an Armstrong Number.");
        } else  {
            System.out.println("This is not an Armstrong Number.");
        }

    }
}
