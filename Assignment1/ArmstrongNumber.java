package com.mpstme;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        System.out.println(num);       // 11

        int numSquare = num*num;       // 121

        int sum = 0;

        while (numSquare>0){
            sum = sum + numSquare%10;   //0+1=1
            numSquare = numSquare/10;   //121/10=12.1 which makes it 12 as it is int
            //step 2
            //1=1+2=3  (new number is 12, so 12 modulus 10 is 2)
            //12 by 10 = 1.2 = 1 (same step continues till number square is less than 0)
            //step 3
            //3=3+1=4  (1 modulus 10 = 1)
            //1 by 10 = 0.1 = 0
            //break
        }
        if (num==sum){
            System.out.println("This is a Neon Number.");
        } else  {
            System.out.println("This is not a Neon Number.");   //sum turns out to be 4 != 121
        }

    }
}
