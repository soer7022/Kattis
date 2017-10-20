package S.spavanac;

import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        sc.close();

        minutes -= 45;

        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
            if (hours < 0) {
                hours += 24;
            }
        }
        System.out.println(hours + " " + minutes);
    }
}
