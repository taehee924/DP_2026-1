package ch04;

import ch04.framework.Factory;
import ch04.framework.Product;
import ch04.idcard.IDCardFactory;
import ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {

        // [3-1] Step 1 테스트: IDCard 발급 날짜 확장
        System.out.println("=== [Step 1] IDCard 테스트 ===");
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println();

        // [3-2] Step 2 테스트: LicenseCard
        System.out.println("=== [Step 2] LicenseCard 테스트 ===");
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}