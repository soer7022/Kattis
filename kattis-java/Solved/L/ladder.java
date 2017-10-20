import java.util.Scanner;

@SuppressWarnings("ALL")
class ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double v = Math.toRadians(sc.nextInt());
        System.out.println((int) Math.ceil(h / (Math.sin(v))));
    }
}
