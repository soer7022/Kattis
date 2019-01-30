package QALY;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double output = 0;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.000", symbols);
        df.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i < n; i++) {
            double qaly = sc.nextDouble();
            double years = sc.nextDouble();
            output += (qaly * years);
        }
        System.out.println(df.format(output));
    }
}
