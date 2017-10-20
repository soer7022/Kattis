package M.mixedfractions;

import java.util.Scanner;

public class mixedfractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int dem = sc.nextInt();
            if (num == 0 && dem == 0) {
                break;
            }
            System.out.println((int) (Math.floor(num / dem)) + " " + num % dem + " / " + dem);
        }
    }
}
