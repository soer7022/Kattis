import java.util.Scanner;

@SuppressWarnings("ALL")
class oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        while(sc.hasNextInt()) {
            int x = sc.nextInt();
            if(x % 2 == 0) {
                System.out.println(x + " is even");
            }
            else {
                System.out.println(x + " is odd");
            }
        }
    }
}
