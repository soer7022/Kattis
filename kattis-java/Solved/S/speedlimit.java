import java.util.Scanner;

class speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataSets = sc.nextInt();
        while(dataSets != -1) {
            int totalDistanceDriven = 0;
            int previoust = 0;
            if(dataSets != -1) {
                for (int i = dataSets; i >= 1; i--) {
                    int s = sc.nextInt();
                    int t = sc.nextInt();
                    totalDistanceDriven += s * (t - previoust);
                    previoust = t;
                }
            }
            dataSets = sc.nextInt();
            System.out.println(totalDistanceDriven + " miles");
        }
    }
}
