package ch04.license;

import ch04.framework.Factory;
import ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String holder) {
        // 만료일: baseDate 기준 5년 후 (연도만 +5, 월일 동일)
        String expiryDate = calcExpiryDate(baseDate, 5);
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 을 등록했습니다.");
    }

    // "YYYY-MM-DD" 형식에서 n년 후 날짜 계산 (간단 문자열 처리)
    private String calcExpiryDate(String date, int yearsToAdd) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]) + yearsToAdd;
        return year + "-" + parts[1] + "-" + parts[2];
    }
}