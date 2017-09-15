import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        double x = 0;
        double pow;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {

            int i = sc.nextInt();
            if(i >= 10) {
                pow = i%10;
                i /= 10;
                x = Math.pow(i,pow);
            }
            else {
                x += i;
            }
        }
        System.out.println(x);
    }
}
