public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;
    private int increment;

    public IncrementalNumberGenerator(int start, int end, int increment) {
        this.start = start;
        this.end = end;
        this.increment = increment;
        this.number = start - increment;
    }

    public int getNumber() {
        return number;
    }

    public void execute() {
        while (number + increment < end) {
            number += increment;
            notifyObservers();
        }
    }
}