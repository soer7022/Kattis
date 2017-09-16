import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        while(sc.hasNextInt()) {
            int x = sc.nextInt();
            boolean isEven;
            if(x % 2 == 0) {
                System.out.println(x + " is even");
            }
            else {
                System.out.println(x + " is odd");
            }
        }
    }
}
