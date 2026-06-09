public class EvenNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
        this.number = start;
    }

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = start; i < end; i += 2) {
            number = i;
            notifyObservers();
        }
    }
}