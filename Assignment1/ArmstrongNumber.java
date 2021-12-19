package com.mpstme;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        System.out.println(num);  // 153

        int sum = 0, len = 0;
        int as_no = num;

        while (as_no>0){
            ++len;          // 153 greater than 0, 0 ==> 1
            as_no=as_no/10; // 153/10 = 15 (int)
        }
        as_no=num;
        while (as_no>0){
            sum+=Math.pow(as_no%10,len);  // 0 + 3^3
            as_no=as_no/10;               // 153/10 = 15
        }

        if (num==sum){
            System.out.println("This is an Armstrong Number.");
        } else  {
            System.out.println("This is not an Armstrong Number.");
        }

    }
}
