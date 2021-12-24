package com.mpstme;

import java.util.Locale;
import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                v++;
            } else if (a >= 'a' && a <= 'z') {
                c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
