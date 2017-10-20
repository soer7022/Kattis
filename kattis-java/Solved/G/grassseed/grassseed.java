package G.grassseed;

import java.util.Locale;
import java.util.Scanner;

public class grassseed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float cost = sc.nextFloat();
        int n = sc.nextInt();

        float total = 0;
        for (int i = 0; i < n; i++) {
            float w = sc.nextFloat();
            float h = sc.nextFloat();
            total += w*h*cost;
        }
        System.out.println(total);
    }
}
