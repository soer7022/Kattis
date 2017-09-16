import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("ALL")
class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbersSeen = new ArrayList<>();
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if(!numbersSeen.contains(i % 42)) {
                numbersSeen.add(i % 42);
            }
        }
        System.out.println(numbersSeen.size());
    }
}
