package com.mpstme;

import java.util.Scanner;

public class MinArrayElement {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = number.nextInt();
        int a[] = new int[size];

        System.out.println("Enter elements of array: ");
        for(int i=0;i<a.length;i++){
            a[i]=number.nextInt();
        }

        System.out.println("Array: ");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }

        int min = a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]<min)
                min=a[i];
        }
        System.out.println();
        System.out.println("Smallest element in the array is "+min);

    }
}
