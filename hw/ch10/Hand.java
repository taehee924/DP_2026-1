package hw.ch10;

public class Hand {
    public static final int ROCK = 0;     // 바위
    public static final int SCISSORS = 1; // 가위
    public static final int PAPER = 2;    // 보
    
    private static final Hand[] hands = {
        new Hand(ROCK),
        new Hand(SCISSORS),
        new Hand(PAPER)
    };
    
    private static final String[] names = {"바위", "가위", "보"};
    
    private int value;
    
    private Hand(int value) {
        this.value = value;
    }
    
    public static Hand getHand(int value) {
        return hands[value % 3];
    }
    
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }
    
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }
    
    public int fight(Hand h) {
        if (this == h) {
            return 0; // 무승부
        } else if ((this.value + 1) % 3 == h.value) {
            return 1; // 이김
        } else {
            return -1; // 짐
        }
    }
    
    @Override
    public String toString() {
        return names[value];
    }
}