package P.pizzaCrust;

import java.util.Scanner;

public class PizzaCrust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        double rArea = Math.PI * Math.pow(r, 2);
        double cArea = Math.PI * Math.pow(r - c, 2);
        System.out.println(cArea / rArea * 10);
    }
}
