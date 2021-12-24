package com.mpstme;

import java.util.Scanner;

public class CopyArrayElements {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter 5 numbers for an array: ");

        int a[] = new int[5];
        int copy[] = new int[5];

        for(int i=0;i<a.length;i++){
            a[i]=number.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            copy[i]=a[i];
        }
        System.out.println();

        System.out.println("Copied Array: ");
        for (int i=0;i< copy.length;i++){
            System.out.print(copy[i]+" ");
        }

    }
}
