package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderChar;

    // 생성자
    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public void use(String s) {
        int len = s.length();

        // 위쪽 라인
        for (int i = 0; i < len; i++) {
            System.out.print(this.borderChar);
        }
        System.out.println();

        // 텍스트 출력
        System.out.println(s);

        // 아래쪽 라인
        for (int i = 0; i < len; i++) {
            System.out.print(this.borderChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;

        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}