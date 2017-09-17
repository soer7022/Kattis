package Solved.T;

import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String max = sc.next();
        int i = 0;
        int startingLocation = 1;
        int currentLocation = startingLocation;
        while (i < max.length()) {
            char operation = max.charAt(i);
            if (operation == 'A') {
                if (currentLocation == 1) {
                    currentLocation = 2;
                } else if (currentLocation == 2) {
                    currentLocation = 1;
                }
            }
            if (operation == 'B') {
                if (currentLocation == 2) {
                    currentLocation = 3;
                } else if (currentLocation == 3) {
                    currentLocation = 2;
                }
            }
            if (operation == 'C') {
                if (currentLocation == 1) {
                    currentLocation = 3;
                } else if (currentLocation == 3) {
                    currentLocation = 1;
                }
            }
            i++;
        }
        System.out.println(currentLocation);
    }
}
