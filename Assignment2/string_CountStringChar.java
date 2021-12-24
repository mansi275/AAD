package com.mpstme;

import java.util.Scanner;

public class CountStringChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s = sc.nextLine();

        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' ')
                count++;
        }

        System.out.println("Total no of characters in the string is "+count);
    }
}
