public class Main {
    public static void main(String[] args) {

        // [Step 1] 한국 콘센트 Adapter로 충전
        System.out.println("=== 한국 콘센트 어댑터를 이용한 스마트폰 충전 ===");

        KoreanOutlet koreanOutlet = new KoreanOutlet();           // 기존 클래스 (220V)
        Charger adapter = new KoreanOutletAdapter(koreanOutlet);  // 어댑터 생성
        Smartphone smartphone = new Smartphone(adapter);          // 스마트폰에 어댑터 전달

        smartphone.charge(); // charge() 호출

        System.out.println("스마트폰이 어댑터를 이용해서 충전이 가능해 짐");
    }
}