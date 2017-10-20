package T;

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        int months = sc.nextInt();
        int total = 0;
        for (int i = 0; i < months; i++) {
            int n = sc.nextInt();
            total -= n;
            total += cap;
        }
        System.out.println(total+cap);
    }
}
