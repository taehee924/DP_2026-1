package ch03.A4;

public class NumberDisplay implements AbstractDisplay {
    private int number;
    private int repeatCount;

    public NumberDisplay(int number, int repeatCount) {
        this.number = number;
        this.repeatCount = repeatCount;
    }

    // 기본 5회
    public NumberDisplay(int number) {
        this.number = number;
        this.repeatCount = 5;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }

    @Override
    public void display() {
        display(repeatCount);
    }
}