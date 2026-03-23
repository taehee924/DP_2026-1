public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet;
    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }
    @Override
    public int charge() {
        int voltage = koreanOutlet.provide();
        return voltage;
    }
}
