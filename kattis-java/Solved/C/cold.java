import java.util.Scanner;

@SuppressWarnings("ALL")
class cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int cold = 0;
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i < 0) {
                cold++;
            }
        }
        System.out.println(cold);
    }
}
