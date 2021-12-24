package com.mpstme;

import java.util.Scanner;

public class WhiteSpaceRemoval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s = sc.nextLine();

        s=s.replaceAll(" ","");

        System.out.println("String without spaces: "+s);
    }
}