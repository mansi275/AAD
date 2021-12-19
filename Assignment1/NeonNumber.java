package com.mpstme;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        System.out.println(num);

        int numSquare = num*num;
        int sum = 0;
        while (numSquare>0){
            sum+=numSquare%10; //sum+= ==> sum + numSquare%10
            numSquare=numSquare/10;
        }
        if (num==sum){
            System.out.println("This is a Neon Number.");
        } else  {
            System.out.println("This is not a Neon Number.");
        }

    }
}
