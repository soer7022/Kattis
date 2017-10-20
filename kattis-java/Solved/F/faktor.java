import java.util.Scanner;

@SuppressWarnings("ALL")
class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int articles = sc.nextInt();
        int factor = sc.nextInt();
        System.out.println(articles * (factor - 1) + 1);
    }
}
