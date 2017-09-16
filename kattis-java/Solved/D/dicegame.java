import java.util.Scanner;

@SuppressWarnings("ALL")
class dicegame {
    public static void main(String[] args) {
        int gunnarTotal = 0;
        int emmaTotal= 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 4; i++) {
            gunnarTotal += sc.nextInt();
        }
        for (int i = 1; i <= 4; i++) {
            emmaTotal += sc.nextInt();
        }
        if(gunnarTotal > emmaTotal) {
            System.out.println("Gunnar");
        }
        if (gunnarTotal < emmaTotal) {
            System.out.println("Emma");
        }
        if (gunnarTotal == emmaTotal) {
            System.out.println("Tie");
        }
    }
}
