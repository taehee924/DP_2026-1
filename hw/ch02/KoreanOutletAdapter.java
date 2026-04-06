// Adapter 클래스: KoreanOutlet(220V)을 Charger 인터페이스로 변환
public class KoreanOutletAdapter implements Charger {

    private KoreanOutlet koreanOutlet; // 어댑트 대상 (Adaptee)

    // KoreanOutlet을 주입받아 내부에 포함
    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }

    // Charger 인터페이스의 charge()를 KoreanOutlet의 provide()로 위임
    @Override
    public int charge() {
        int voltage = koreanOutlet.provide(); // 220V 반환
        return voltage;
    }
}