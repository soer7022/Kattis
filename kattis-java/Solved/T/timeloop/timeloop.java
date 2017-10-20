package T.timeloop;

import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 1; i <= times; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
