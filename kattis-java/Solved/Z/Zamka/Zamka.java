package Solved.Z.Zamka;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        int currentNumber = l;
        while (currentNumber <= d) {
            int sum = 0;
            int currentNumberCopy = currentNumber;
            while (currentNumberCopy > 0) {
                sum = sum + currentNumberCopy % 10;
                currentNumberCopy = currentNumberCopy / 10;
            }
            if(sum == x) {
                System.out.println(currentNumber);
                break;
            } else {
                currentNumber++;
            }
        }

        currentNumber = d;
        while (currentNumber >= l) {
            int sum = 0;
            int currentNumberCopy = currentNumber;
            while (currentNumberCopy > 0) {
                sum = sum + currentNumberCopy % 10;
                currentNumberCopy = currentNumberCopy / 10;
            }
            if(sum == x) {
                System.out.println(currentNumber);
                break;
            } else {
                currentNumber--;
            }
        }
    }
}
