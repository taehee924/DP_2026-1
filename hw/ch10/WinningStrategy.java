package hw.ch10;

public class WinningStrategy implements Strategy {
    private boolean won = false;
    private Hand prevHand;
    
    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand((int)(Math.random() * 3));
        }
        return prevHand;
    }
    
    @Override
    public void study(boolean win) {
        won = win;
    }
}