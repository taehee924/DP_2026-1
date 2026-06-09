public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new EvenNumberGenerator(0, 30);
        
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        Observer rangeObserver = new RangeObserver();
        
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.addObserver(rangeObserver);
        
        generator.execute();
    }
}