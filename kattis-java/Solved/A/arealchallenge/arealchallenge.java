package A.arealchallenge;

import java.util.Scanner;

public class arealchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long area = sc.nextLong();
        System.out.println(Math.sqrt((double) (area)) * 4);
    }
}
