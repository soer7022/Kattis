package F.FizzBuzz;

import java.util.Objects;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String out = "";
            if (i % x == 0) {
                out += "Fizz";
            }
            if (i % y == 0) {
                out += "Buzz";
            }
            if (!Objects.equals(out, "")) {
                System.out.println(out);
            } else {
                System.out.println(i);
            }
        }
    }
}
