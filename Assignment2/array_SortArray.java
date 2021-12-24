package com.mpstme;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = number.nextInt();
        int a[] = new int[size];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = number.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Arrays.sort(a);
        System.out.println();
        System.out.println("Elements of array in ascending array are: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}