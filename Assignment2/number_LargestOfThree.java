package com.mpstme;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = num1.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = num2.nextInt();
        System.out.println("Enter the 3rd number: ");
        int n3 = num3.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("Largest number is "+n1);
        } else if (n2>n1 && n2>n3){
            System.out.println("Largest number is "+n2);
        } else
            System.out.println("Largest number is "+n3);
    }
}
