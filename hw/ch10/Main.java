package hw.ch10;

import hw.ch10.CyclicStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      Strategy 패턴 - CyclicStrategy");
        System.out.println("========================================\n");
        
        // ===== RandomStrategy 테스트 =====
        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));
        
        // ===== CyclicStrategy 테스트 =====
        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());
        
        // CyclicStrategy의 손가락 순환 확인
        System.out.println("\nCyclicStrategy 의 손가락 순환:");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }
        
        // ===== 게임 진행 (10번) =====
        System.out.println("\n===== 10번 게임 진행 결과 =====");
        playGame(player1, player2, 10);
        
        System.out.println("\n최종 결과:");
        System.out.println(player1);
        System.out.println(player2);
    }
    
    /**
     * 두 플레이어가 게임을 진행
     */
    public static void playGame(Player player1, Player player2, int times) {
        for (int i = 0; i < times; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            
            if (hand1.isStrongerThan(hand2)) {
                System.out.println((i+1) + "번째: " + player1.getName() + "(" + hand1 + ") vs " 
                                   + player2.getName() + "(" + hand2 + ") => " + player1.getName() + " 승리");
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println((i+1) + "번째: " + player1.getName() + "(" + hand1 + ") vs " 
                                   + player2.getName() + "(" + hand2 + ") => " + player2.getName() + " 승리");
                player1.lose();
                player2.win();
            } else {
                System.out.println((i+1) + "번째: " + player1.getName() + "(" + hand1 + ") vs " 
                                   + player2.getName() + "(" + hand2 + ") => 무승부");
                player1.even();
                player2.even();
            }
        }
    }
}