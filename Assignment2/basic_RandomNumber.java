package com.mpstme;

import java.util.Scanner;
import java.lang.Math;

public class RandomNumber {

    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the min limit: ");
        int min = num1.nextInt();
        System.out.println("Enter the max limit: ");
        int max = num2.nextInt();

        int num = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Random number between "+min+" and "+max+" is: "+num);

    }
}
