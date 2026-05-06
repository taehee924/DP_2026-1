public class Main {
    public static void main(String[] args) {
        // MultiStringDisplay 생성 및 문자열 추가
        MultiStringDisplay md = new MultiStringDisplay();
        md.addString("Hello, Java!");
        md.addString("Decorator Pattern");
        md.addString("is powerful.");

        // [2-1] 원본 출력
        System.out.println("========== [2-1] 원본 출력 ==========");
        md.show();

        // [2-2] NumberedBorder 단독 적용
        System.out.println("\n========== [2-2] NumberedBorder 단독 적용 ==========");
        Display d1 = new NumberedBorder(md);
        d1.show();

        // [2-3] FullBorder + NumberedBorder 조합
        System.out.println("\n========== [2-3] FullBorder + NumberedBorder 조합 ==========");
        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();

        // [2-4] SideBorder + NumberedBorder + FullBorder 3 단 중첩
        System.out.println("\n========== [2-4] SideBorder + NumberedBorder + FullBorder 3 단 중첩 ==========");
        Display d3 = new SideBorder(new FullBorder(new NumberedBorder(md)), '*');
        d3.show();
    }
}