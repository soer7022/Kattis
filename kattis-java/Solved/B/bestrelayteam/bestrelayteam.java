package B.bestrelayteam;

import java.util.*;

public class bestrelayteam {
    public static void main(String[] args) {
        class Runner {
            private String name;
            private double firstLeg;
            private double lastLeg;

            private Runner(String name, double firstLeg, double lastLeg) {
                this.name = name;
                this.firstLeg = firstLeg;
                this.lastLeg = lastLeg;
            }

            private double getFirstLeg() {
                return firstLeg;
            }

            private double getLastLeg() {
                return lastLeg;
            }

            private String getName() {
                return name;
            }
        }
        ArrayList<Runner> runners = new ArrayList<>();
        ArrayList<Runner> fourFastest = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double firstLeg = sc.nextDouble();
            double lastLeg = sc.nextDouble();

            runners.add(new Runner(name, firstLeg, lastLeg));
        }

        runners.sort(Comparator.comparingDouble(Runner::getLastLeg));
        double fourTime = 0;

        for (int i = 0; i < 4; i++) {
            fourFastest.add(runners.get(i));
            fourTime += runners.get(i).getLastLeg();
        }

        double bestTime = Double.POSITIVE_INFINITY;
        Runner bestRunner = null;

        for (Runner r : runners) {
            double totalTime = fourTime;
            totalTime += r.getFirstLeg();
            if (fourFastest.contains(r)) {
                totalTime -= r.getLastLeg();
            } else {
                totalTime -= fourFastest.get(3).getLastLeg();
            }
            if (bestRunner == null || totalTime < bestTime) {
                bestTime = totalTime;
                bestRunner = r;
            }
        }

        System.out.println(bestTime);
        assert bestRunner != null;
        System.out.println(bestRunner.getName());
        if (fourFastest.contains(bestRunner)) {
            fourFastest.remove(bestRunner);
        } else {
            fourFastest.remove(3);
        }
        for (Runner r : fourFastest) {
            System.out.println(r.getName());
        }

    }
}
