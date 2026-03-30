package ch03.A4;

public class StringDisplay implements AbstractDisplay {
    private String string;
    private int width;
    private int repeatCount;

    // 기존 생성자 (기본 5회)
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
        this.repeatCount = 5;
    }

    // 반복 횟수 지정 생성자
    public StringDisplay(String string, int repeatCount) {
        this.string = string;
        this.width = string.length();
        this.repeatCount = repeatCount;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void display() {
        display(repeatCount);
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}