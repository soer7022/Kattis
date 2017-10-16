package com.kattis.autori;

import java.util.ArrayList;
import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] names = input.split("-");
        for (String n : names) {
            System.out.print(n.charAt(0));
        }
    }
}
