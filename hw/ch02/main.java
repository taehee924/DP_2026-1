public class Main {
    public static void main(String[] args) {
        System.out.println("=== 한국 콘센트 어댑터를 이용한 스마트폰 충전 ===");
        KoreanOutlet koreanOutlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(koreanOutlet);
        Smartphone smartphone = new Smartphone(adapter);
        smartphone.charge();
        System.out.println("스마트폰이 어댑터를 이용해서 충전이 가능해 짐");
    }
}
