package Solved.H.houselawn;

import java.util.*;

public class houselawn {
    public static void main(String[] args) {
        houselawn houselawn = new houselawn();
        houselawn.run();
    }

    public class Mower {
        private String name;
        private final int price;
        private final int rate;
        private final int time;
        private final int recharge;

        Mower(String name, int price, int rate, int time, int recharge) {
            this.name = name;
            this.price = price;
            this.rate = rate;
            this.time = time;
            this.recharge = recharge;
        }

        public int getPrice() {
            return price;
        }

        public int getRate() {
            return rate;
        }

        public int getTime() {
            return time;
        }

        public int getRecharge() {
            return recharge;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getName();
        }
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        int lawnSize = scanner.nextInt();
        int numberMowers = scanner.nextInt();

        scanner.useDelimiter("[,\n]");

        List<Mower> mowers = new ArrayList<>();
        for (int i = 0; i < numberMowers; i++) {
            String name = scanner.next();
            int price = scanner.nextInt();
            int rate = scanner.nextInt();
            int time = scanner.nextInt();
            int recharge = scanner.nextInt();
            Mower mower = new Mower(name, price, rate, time, recharge);
            if (canCutLawn(mower, lawnSize)) {
                mowers.add(mower);
            }
        }

        if(mowers.size() == 0) {
            System.out.println("no such mower");
            return;
        }

        Mower lowestCostMower = mowers.stream().min(Comparator.comparingInt(Mower::getPrice)).orElseThrow(NoSuchElementException::new);
        int lowestCost = lowestCostMower.getPrice();

        mowers.stream().filter(m -> m.getPrice() == lowestCost).forEach(System.out::println);

    }

    private boolean canCutLawn(Mower mower, int lawn) {
        double cutPerMinute = (mower.getRate() * mower.getTime()) / (double)(mower.getTime() + mower.getRecharge());
        double y = cutPerMinute * 10080;
        return lawn <= y;
    }
}