package ch03.A4;

public class Main {
    public static void main(String[] args) {

        // [3-1] 기본 테스트 (기존 호환성 확인)
        System.out.println("=== [3-1] 기본 테스트 ===");
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();

        // [3-2] Step 1 테스트: 반복 횟수 제어
        System.out.println("\n=== [3-2] 반복 횟수 제어 테스트 ===");
        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);
        d3.display();
        d4.display();

        // [3-3] Step 2 테스트: NumberDisplay
        System.out.println("\n=== [3-3] NumberDisplay 테스트 ===");
        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}
```

---

## 예상 출력
```
=== [3-1] 기본 테스트 ===
<<HHHHH>>
+-----+
|Hello|
|Hello|
|Hello|
|Hello|
|Hello|
+-----+

=== [3-2] 반복 횟수 제어 테스트 ===
<<XXX>>
+----+
|Test|
|Test|
|Test|
|Test|
|Test|
|Test|
|Test|
+----+

=== [3-3] NumberDisplay 테스트 ===
<<Number>>
42
42
42
42
<<Number>>