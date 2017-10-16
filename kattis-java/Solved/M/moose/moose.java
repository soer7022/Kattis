package com.kattis.moose;

import java.util.Scanner;

public class moose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (l == 0 && r == 0) {
            System.out.println("Not a moose");
        }
         else if(l == r) {
            System.out.println("Even " + (l + r));
        }
        else {
            System.out.print("Odd ");
            System.out.print(Math.max(l,r) * 2);
        }
    }
}
