package hw.ch10;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;
    private int seed;
    
    public RandomStrategy(int seed) {
        this.random = new Random(seed);
        this.seed = seed;
    }
    
    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }
    
    @Override
    public void study(boolean win) {
        // RandomStrategy는 학습하지 않음
    }
}