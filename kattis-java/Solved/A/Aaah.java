import java.util.Scanner;

@SuppressWarnings("ALL")
class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mariusAaah = sc.next();
        String doctorAaah = sc.next();

        if (mariusAaah.length() >= doctorAaah.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
