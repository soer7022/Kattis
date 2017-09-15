import java.util.Scanner;

public class easiest {
    public static void main(String[] args) {
        int currentN = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            currentN = sc.nextInt();
            if(currentN == 0) {
                break;
            }
            int sumToMatch = sumOfDigits(currentN);
            for (int i = 11; i < 1000000; i++) {
                if(sumOfDigits(currentN*i) == sumToMatch) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static int sumOfDigits(int digits) {
        int totalsum = 0;
        if(digits < 10) {
            return digits;
        }
        while(digits > 0) {
            totalsum += digits % 10;
            digits /= 10;
        }
        return totalsum;
    }
}
