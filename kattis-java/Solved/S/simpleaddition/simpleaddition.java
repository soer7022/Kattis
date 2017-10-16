package S.simpleaddition;

import java.math.BigInteger;
import java.util.Scanner;

public class simpleaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger input1 = new BigInteger(sc.next());
        BigInteger input2 = new BigInteger(sc.next());
        System.out.println(input1.add(input2));
    }
}
