package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int index = 0; // 현재 손가락 인덱스 (0: 바위, 1: 가위, 2: 보)
    
    /**
     * 순환하는 손가락 전략
     * 0 (바위) → 1 (가위) → 2 (보) → 0 (바위) → ...
     */
    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(index);
        index = (index + 1) % 3; // 0, 1, 2를 순환
        return hand;
    }
    
    /**
     * CyclicStrategy는 학습을 하지 않음
     * study 메서드 호출해도 동작에 영향을 주지 않음
     */
    @Override
    public void study(boolean win) {
        // 순환 전략은 승패 결과를 학습하지 않음
        // 아무것도 하지 않음
    }
}