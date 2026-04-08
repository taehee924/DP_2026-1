package ch05;
public class Main {
    public static void main(String[] args) {

        // 방식 1
        System.out.println("========== 방식 1 ==========");
        LoggerStaticInit logger1a = LoggerStaticInit.getInstance();
        LoggerStaticInit logger1b = LoggerStaticInit.getInstance();

        logger1a.log("Static Message 1");
        logger1b.log("Static Message 2");

        System.out.println(logger1a == logger1b ? "✓ 동일한 인스턴스" : "✗ 다른 인스턴스");
        System.out.println(logger1a.getLog());

        // 방식 2
        System.out.println("\n========== 방식 2 ==========");
        LoggerSynchronizedLazy logger2a = LoggerSynchronizedLazy.getInstance();
        LoggerSynchronizedLazy logger2b = LoggerSynchronizedLazy.getInstance();

        logger2a.log("Sync Message 1");
        logger2b.log("Sync Message 2");

        System.out.println(logger2a == logger2b ? "✓ 동일한 인스턴스" : "✗ 다른 인스턴스");
        System.out.println(logger2a.getLog());

        // 방식 3
        System.out.println("\n========== 방식 3 ==========");
        LoggerEnum logger3a = LoggerEnum.INSTANCE;
        LoggerEnum logger3b = LoggerEnum.INSTANCE;

        logger3a.log("Enum Message 1");
        logger3b.log("Enum Message 2");

        System.out.println(logger3a == logger3b ? "✓ 동일한 인스턴스" : "✗ 다른 인스턴스");
        System.out.println(logger3a.getLog());
    }
}