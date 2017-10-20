package Solved.W.WhatDoesTheFoxSay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class wdtfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            ArrayList<String> fox = new ArrayList<>();
            String input = sc.nextLine();
            String[] output = input.split(" ");
            Collections.addAll(fox, output);
            String currentLine = "";
            while (!currentLine.contains("fox")) {
                currentLine = sc.nextLine();
                String wordToRemove = currentLine.substring(currentLine.indexOf("goes") + 5, currentLine.length());
                fox.removeAll(Collections.singleton(wordToRemove));
            }
            for (String s : fox) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }

    }
}
