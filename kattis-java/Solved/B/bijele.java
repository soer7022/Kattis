import java.util.Scanner;

@SuppressWarnings("ALL")
class bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kings = 1 - sc.nextInt();
        int queens = 1 - sc.nextInt();
        int rooks = 2 - sc.nextInt();
        int bishops = 2 - sc.nextInt();
        int knights = 2 - sc.nextInt();
        int pawns = 8 - sc.nextInt();
        System.out.println(kings + " " + queens + " " + rooks + " " + bishops + " " + knights + " " + pawns);
    }
}
