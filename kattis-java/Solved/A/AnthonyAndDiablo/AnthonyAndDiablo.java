package A.AnthonyAndDiablo;

import java.util.Locale;
import java.util.Scanner;

public class AnthonyAndDiablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double A = sc.nextDouble();
        double N = sc.nextDouble();
        double S = Math.sqrt(A);

        double rad = N / (2 * Math.PI);
        double area = Math.PI * Math.pow(rad,2);

        if (area >= A) {
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
}
