package S.sevenwonders;

import java.util.Scanner;

public class sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("");
        String input = sc.nextLine();
        String[] chars = input.split("");

        int t = 0;
        int c = 0;
        int g = 0;

        for (String s : chars) {
            if (s.equals("T")) {
                t++;
            }
            if (s.equals("C")) {
                c++;
            }
            if (s.equals("G")) {
                g++;
            }
        }
        System.out.println((int) (Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2) + (Math.min(t, (Math.min(c, g))) * 7)));
    }
}
